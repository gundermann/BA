/**
 * generated by Xtext
 */
package org.deg.xtext.gui.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.deg.xtext.gui.guiDSL.ButtonDefinition;
import org.deg.xtext.gui.guiDSL.ComponentDefinition;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.DescriptionType;
import org.deg.xtext.gui.guiDSL.InterchangeableDefinition;
import org.deg.xtext.gui.guiDSL.LabelDefinition;
import org.deg.xtext.gui.guiDSL.LabelProperties;
import org.deg.xtext.gui.guiDSL.Refinement;
import org.deg.xtext.gui.guiDSL.TreeDefinition;
import org.deg.xtext.gui.guiDSL.Type;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;
import org.deg.xtext.gui.guiDSL.UsedDescription;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 */
@SuppressWarnings("all")
public class GuiDSLGenerator implements IGenerator {
  private String specificFilename;
  
  private String descriptionname;
  
  private List<String> imports = new ArrayList<String>();
  
  private List<String> globalVars = new ArrayList<String>();
  
  private String mainContainer;
  
  private String packageName;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String _descriptionName = this.getDescriptionName(_uRI);
    this.descriptionname = _descriptionName;
    URI _uRI_1 = resource.getURI();
    String _getPackageName = this.getGetPackageName(_uRI_1);
    this.packageName = _getPackageName;
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<UIDescription> _filter = Iterables.<UIDescription>filter(_iterable, UIDescription.class);
    this.genGuiClass(_filter, fsa);
  }
  
  public String getGetPackageName(final URI uri) {
    for (int index = 0; (index < (uri.segmentCount() - 1)); index++) {
      String _segment = uri.segment(index);
      boolean _equals = _segment.equals("src");
      if (_equals) {
        index++;
        int _segmentCount = uri.segmentCount();
        int _minus = (_segmentCount - 1);
        boolean _notEquals = (index != _minus);
        if (_notEquals) {
          StringBuilder sb = new StringBuilder();
          String _segment_1 = uri.segment(index);
          sb.append(_segment_1);
          for (index++; (index < (uri.segmentCount() - 1)); index++) {
            StringBuilder _append = sb.append("\\/");
            String _segment_2 = uri.segment(index);
            _append.append(_segment_2);
          }
          return sb.toString();
        }
      }
    }
    return "";
  }
  
  public String getDescriptionName(final URI uri) {
    int _segmentCount = uri.segmentCount();
    int _minus = (_segmentCount - 1);
    String _segment = uri.segment(_minus);
    String[] _split = _segment.split("\\.");
    return _split[0];
  }
  
  public void genGuiClass(final Iterable<UIDescription> uiDescriptions, final IFileSystemAccess fsa) {
    this.specificFilename = ("Gui" + this.descriptionname);
    for (final UIDescription d : uiDescriptions) {
      {
        TypeDefinition _typeDefinition = d.getTypeDefinition();
        Type _type = _typeDefinition.getType();
        String _id = _type.getId();
        boolean _equals = _id.equals("WINDOW");
        if (_equals) {
          this.mainContainer = "contentPane";
          CharSequence source = this.compileWindow(d);
          CharSequence _genPackage = this.genPackage();
          String _genImports = this.genImports();
          String _plus = (_genPackage + _genImports);
          String _plus_1 = (_plus + source);
          fsa.generateFile((((this.packageName + "/") + this.specificFilename) + ".java"), _plus_1);
        } else {
          this.mainContainer = "this";
          CharSequence source_1 = this.compileComplex(d);
          CharSequence _genPackage_1 = this.genPackage();
          String _genImports_1 = this.genImports();
          String _plus_2 = (_genPackage_1 + _genImports_1);
          String _plus_3 = (_plus_2 + source_1);
          fsa.generateFile((((this.packageName + "/") + this.specificFilename) + ".java"), _plus_3);
        }
        this.imports.clear();
        this.globalVars.clear();
      }
    }
  }
  
  public String genIpClass(final IFileSystemAccess fsa) {
    return this.specificFilename = ("Ip" + this.descriptionname);
  }
  
  public CharSequence genPackage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _replace = this.packageName.replace("\\/", "\\.");
    _builder.append(_replace, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public String genImports() {
    StringBuilder sb = new StringBuilder();
    for (final String import_ : this.imports) {
      StringBuilder _append = sb.append(import_);
      _append.append("\n");
    }
    return sb.toString();
  }
  
  public CharSequence compileComplex(final UIDescription description) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfPanel;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* Generated by Xtext.");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.specificFilename, "");
    _builder.append(" extends PfPanel{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.newLine();
    CharSequence _genRest = this.genRest(description);
    _builder.append(_genRest, "");
    _builder.newLineIfNotEmpty();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getInit(final UIDescription description) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void init(){");
    _builder.newLine();
    {
      EList<Definition> _definitions = description.getDefinitions();
      for(final Definition def : _definitions) {
        _builder.append("\t\t\t\t");
        CharSequence _compileDefinition = this.compileDefinition(def);
        _builder.append(_compileDefinition, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Refinement> _refinements = description.getRefinements();
      for(final Refinement ref : _refinements) {
        _builder.append("\t\t\t\t");
        Object _compileRefinement = this.compileRefinement(ref);
        _builder.append(_compileRefinement, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<UsedDescription> _usedDescriptions = description.getUsedDescriptions();
      for(final UsedDescription usedDescription : _usedDescriptions) {
        _builder.append("\t\t\t\t");
        CharSequence _compile = this.compile(usedDescription);
        _builder.append(_compile, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<UsedDescription> _usedDescriptions_1 = description.getUsedDescriptions();
      boolean _isEmpty = _usedDescriptions_1.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t\t\t\t");
        String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfPanel;");
        _builder.append(_addImport, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("PfPanel panel = new PfPanel(new BorderLayout());");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("panel.add(");
        EList<UsedDescription> _usedDescriptions_2 = description.getUsedDescriptions();
        UsedDescription _get = _usedDescriptions_2.get(0);
        String _id = _get.getId();
        _builder.append(_id, "\t\t\t\t");
        _builder.append(", BorderLayout.NORTH);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("panel.add(");
        EList<UsedDescription> _usedDescriptions_3 = description.getUsedDescriptions();
        UsedDescription _get_1 = _usedDescriptions_3.get(1);
        String _id_1 = _get_1.getId();
        _builder.append(_id_1, "\t\t\t\t");
        _builder.append(", BorderLayout.SOUTH);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("this.add(panel, BorderLayout.WEST);");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final UsedDescription description) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DescriptionType _descriptionType = description.getDescriptionType();
      if ((_descriptionType instanceof UIDescriptionImport)) {
        DescriptionType _descriptionType_1 = description.getDescriptionType();
        UIDescriptionImport castedDescriptionType = ((UIDescriptionImport) _descriptionType_1);
        _builder.newLineIfNotEmpty();
        String _descriptionName = castedDescriptionType.getDescriptionName();
        String usedQualifiedClassName = this.genGuiFileName(_descriptionName);
        _builder.newLineIfNotEmpty();
        String _id = description.getId();
        String _plus = ((usedQualifiedClassName + " ") + _id);
        String _plus_1 = (_plus + ";");
        String _addGlobalVar = this.addGlobalVar(_plus_1);
        _builder.append(_addGlobalVar, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _id_1 = description.getId();
        _builder.append(_id_1, "\t");
        _builder.append(" = new ");
        _builder.append(usedQualifiedClassName, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      } else {
        Object _genComplexComponent = this.genComplexComponent(description);
        _builder.append(_genComplexComponent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String genGuiFileName(final String descriptionName) {
    String[] separatedName = descriptionName.split("\\.");
    final String[] _converted_separatedName = (String[])separatedName;
    int _size = ((List<String>)Conversions.doWrapArray(_converted_separatedName)).size();
    int _minus = (_size - 1);
    final String[] _converted_separatedName_1 = (String[])separatedName;
    int _size_1 = ((List<String>)Conversions.doWrapArray(_converted_separatedName_1)).size();
    int _minus_1 = (_size_1 - 1);
    String _get = separatedName[_minus_1];
    String _plus = ("Gui" + _get);
    separatedName[_minus] = _plus;
    final String[] _converted_separatedName_2 = (String[])separatedName;
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(_converted_separatedName_2)), ".");
  }
  
  public Object genComplexComponent(final UsedDescription description) {
    return null;
  }
  
  public Object compileRefinement(final Refinement refinement) {
    return null;
  }
  
  public String addImport(final String newImport) {
    boolean _contains = this.imports.contains(newImport);
    boolean _not = (!_contains);
    if (_not) {
      this.imports.add(newImport);
    }
    return "";
  }
  
  public CharSequence compileWindow(final UIDescription description) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfRootPane;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* Generated by Xtext.");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.specificFilename, "");
    _builder.append(" extends PfRootPane{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _genRest = this.genRest(description);
    _builder.append(_genRest, "");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genRest(final UIDescription description) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import java.awt.BorderLayout;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(this.specificFilename, "\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("super( new BorderLayout() );");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t \t\t\t\t");
    _builder.append("init();");
    _builder.newLine();
    _builder.append("\t\t\t \t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("catch ( Exception e ) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _init = this.getInit(description);
    _builder.append(_init, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Generated global variables.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _genGlobalVars = this.genGlobalVars();
    _builder.append(_genGlobalVars, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genGlobalVars() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String v : this.globalVars) {
        _builder.append("private ");
        _builder.append(v, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genInteractions() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compileDefinition(final Definition definition) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ComponentDefinition _concreteDefition = definition.getConcreteDefition();
      String _name = _concreteDefition.getName();
      boolean _equals = Objects.equal(_name, "Label");
      if (_equals) {
        ComponentDefinition _concreteDefition_1 = definition.getConcreteDefition();
        CharSequence _compileLabel = this.compileLabel(((LabelDefinition) _concreteDefition_1));
        _builder.append(_compileLabel, "");
        _builder.newLineIfNotEmpty();
      } else {
        ComponentDefinition _concreteDefition_2 = definition.getConcreteDefition();
        String _name_1 = _concreteDefition_2.getName();
        boolean _equals_1 = Objects.equal(_name_1, "Tree");
        if (_equals_1) {
          ComponentDefinition _concreteDefition_3 = definition.getConcreteDefition();
          CharSequence _compileTree = this.compileTree(((TreeDefinition) _concreteDefition_3));
          _builder.append(_compileTree, "");
          _builder.newLineIfNotEmpty();
        } else {
          ComponentDefinition _concreteDefition_4 = definition.getConcreteDefition();
          String _name_2 = _concreteDefition_4.getName();
          boolean _equals_2 = Objects.equal(_name_2, "Interchangeable");
          if (_equals_2) {
            ComponentDefinition _concreteDefition_5 = definition.getConcreteDefition();
            CharSequence _compileInterchangeable = this.compileInterchangeable(((InterchangeableDefinition) _concreteDefition_5));
            _builder.append(_compileInterchangeable, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileInterchangeable(final InterchangeableDefinition definition) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfCardPanel;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    String _id = definition.getId();
    String _plus = ("PfCardPanel " + _id);
    String _plus_1 = (_plus + ";");
    String _addGlobalVar = this.addGlobalVar(_plus_1);
    _builder.append(_addGlobalVar, "");
    _builder.newLineIfNotEmpty();
    String _id_1 = definition.getId();
    _builder.append(_id_1, "");
    _builder.append(" = new PfCardPanel();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _id_2 = definition.getId();
    _builder.append(_id_2, "\t");
    _builder.append(".setIfName(\"");
    String _id_3 = definition.getId();
    _builder.append(_id_3, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("this.add(");
    String _id_4 = definition.getId();
    _builder.append(_id_4, "");
    _builder.append(", BorderLayout.CENTER);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileTree(final TreeDefinition definition) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfTree;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    String _addImport_1 = this.addImport("import DE.data_experts.jwammc.core.pf.TreeCellRenderer;");
    _builder.append(_addImport_1, "");
    _builder.newLineIfNotEmpty();
    String _addImport_2 = this.addImport("import javax.swing.tree.DefaultTreeModel;");
    _builder.append(_addImport_2, "");
    _builder.newLineIfNotEmpty();
    String _id = definition.getId();
    String _plus = ("PfTree " + _id);
    String _plus_1 = (_plus + ";");
    String _addGlobalVar = this.addGlobalVar(_plus_1);
    _builder.append(_addGlobalVar, "");
    _builder.newLineIfNotEmpty();
    String _id_1 = definition.getId();
    _builder.append(_id_1, "");
    _builder.append(" = new PfTree();");
    _builder.newLineIfNotEmpty();
    String _id_2 = definition.getId();
    _builder.append(_id_2, "");
    _builder.append(".setIfName(\"");
    String _id_3 = definition.getId();
    _builder.append(_id_3, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      String _inputType = definition.getInputType();
      boolean _equals = Objects.equal(_inputType, null);
      if (_equals) {
        String _addImport_3 = this.addImport("import DE.data_experts.util.ObjectNode;");
        _builder.append(_addImport_3, "");
        _builder.newLineIfNotEmpty();
        String _id_4 = definition.getId();
        _builder.append(_id_4, "");
        _builder.append(".setTreeModel( new DefaultTreeModel( new ObjectNode() ) );");
        _builder.newLineIfNotEmpty();
      } else {
        String _id_5 = definition.getId();
        _builder.append(_id_5, "");
        _builder.append(".setTreeModel( new DefaultTreeModel( new ");
        String _inputType_1 = definition.getInputType();
        String _inputType_2 = definition.getInputType();
        int _length = _inputType_2.length();
        int _minus = (_length - 1);
        String _substring = _inputType_1.substring(1, _minus);
        _builder.append(_substring, "");
        _builder.append("() ) );");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    String _id_6 = definition.getId();
    _builder.append(_id_6, "\t");
    _builder.append(".setCellRenderer( new TreeCellRenderer() );");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    String _addImport_4 = this.addImport("import DE.data_experts.jwammc.core.pf.PfScrollPane;");
    _builder.append(_addImport_4, "\t\t");
    _builder.newLineIfNotEmpty();
    String _addImport_5 = this.addImport("import java.awt.Dimension;");
    _builder.append(_addImport_5, "");
    _builder.newLineIfNotEmpty();
    String _addGlobalVar_1 = this.addGlobalVar("PfScrollPane scrollPane;");
    _builder.append(_addGlobalVar_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("scrollPane = new PfScrollPane(");
    String _id_7 = definition.getId();
    _builder.append(_id_7, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("scrollPane.setMinimumSize( new Dimension( 200, 200 ) );");
    _builder.newLine();
    _builder.append("this.add( scrollPane, BorderLayout.CENTER );");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileLabel(final LabelDefinition definition) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import DE.data_experts.jwammc.core.pf.PfLabel;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    String _id = definition.getId();
    String _plus = ("PfLabel " + _id);
    String _plus_1 = (_plus + ";");
    String _addGlobalVar = this.addGlobalVar(_plus_1);
    _builder.append(_addGlobalVar, "");
    _builder.newLineIfNotEmpty();
    String _id_1 = definition.getId();
    _builder.append(_id_1, "");
    _builder.append(" = new PfLabel();");
    _builder.newLineIfNotEmpty();
    String _id_2 = definition.getId();
    _builder.append(_id_2, "");
    _builder.append(".setIfName(\"");
    String _id_3 = definition.getId();
    _builder.append(_id_3, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      LabelProperties _properties = definition.getProperties();
      boolean _notEquals = (!Objects.equal(_properties, null));
      if (_notEquals) {
        String _id_4 = definition.getId();
        LabelProperties _properties_1 = definition.getProperties();
        String _text = _properties_1.getText();
        CharSequence _genProperty = this.genProperty(_id_4, "setText", _text, Boolean.valueOf(true));
        _builder.append(_genProperty, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.mainContainer, "\t\t");
    _builder.append(".add(");
    String _id_5 = definition.getId();
    _builder.append(_id_5, "\t\t");
    _builder.append(", BorderLayout.NORTH);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genProperty(final String id, final String method, final String value, final Boolean isString) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(value, null));
      if (_notEquals) {
        {
          if ((isString).booleanValue()) {
            _builder.append(id, "");
            _builder.append(".");
            _builder.append(method, "");
            _builder.append("(\"");
            _builder.append(value, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append(id, "");
            _builder.append(".");
            _builder.append(method, "");
            _builder.append("(");
            _builder.append(value, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public String addGlobalVar(final String globalVar) {
    boolean _contains = this.globalVars.contains(globalVar);
    boolean _not = (!_contains);
    if (_not) {
      this.globalVars.add(globalVar);
    }
    return "";
  }
  
  public CharSequence compileButton(final ButtonDefinition definition) {
    StringConcatenation _builder = new StringConcatenation();
    String _addImport = this.addImport("import javafx.scene.control.Button;");
    _builder.append(_addImport, "");
    _builder.newLineIfNotEmpty();
    String _name = definition.getName();
    String _plus = ("Button " + _name);
    String _plus_1 = (_plus + ";");
    String _addGlobalVar = this.addGlobalVar(_plus_1);
    _builder.append(_addGlobalVar, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_1 = definition.getName();
    _builder.append(_name_1, "\t");
    _builder.append("= new Button();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _name_2 = definition.getName();
    _builder.append(_name_2, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
