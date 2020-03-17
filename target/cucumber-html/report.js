$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("validation.feature");
formatter.feature({
  "line": 2,
  "name": "Applicaltion Validation",
  "description": "",
  "id": "applicaltion-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sprint"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify loading of documentation page",
  "description": "",
  "id": "applicaltion-validation;verify-loading-of-documentation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "URL is lunched",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "compare the title actual with expected",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validations are \"true\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.url_is_lunched()"
});
