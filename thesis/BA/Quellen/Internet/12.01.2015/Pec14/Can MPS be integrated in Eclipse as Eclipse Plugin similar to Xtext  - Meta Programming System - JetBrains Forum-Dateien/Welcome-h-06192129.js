cr.setTemplateBind("Welcome", function (path) {
  cr.ach(path, "loginLink", "click", function (event, data) {
    cr.serverMethodCallInHandler(event, "" + "." + "methodCall_login", {__param__location: window.location});
  });
  cr.ach(path, "logoutLink", "click", function (event, data) {
    cr.serverMethodCallInHandler(event, "" + "." + "methodCall_logout", {__param__location: window.location});
  });
  cr.ach(path, "registerLink", "click", function (event, data) {
    cr.serverMethodCallInHandler(event, "" + "." + "methodCall_register", {__param__location: window.location});
  });
  regmn(path, "userMenu");
});
