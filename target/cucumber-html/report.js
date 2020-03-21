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
formatter.result({
  "duration": 27401656263,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.compare_the_title_actual_with_expected()"
});
formatter.result({
  "duration": 965901445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 17
    }
  ],
  "location": "stepDefination.validations_are(String)"
});
formatter.result({
  "duration": 12456182,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify status code of the documentation page",
  "description": "",
  "id": "applicaltion-validation;verify-status-code-of-the-documentation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Tester is on documentation page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Verify status code of documentation page having URL \"https://developer.here.com/documentation\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "validation are as per expected \"true\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.tester_is_on_documentation_page()"
});
formatter.result({
  "duration": 873409479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://developer.here.com/documentation",
      "offset": 53
    }
  ],
  "location": "stepDefination.verify_status_code_of_documentation_page_having_URL(String)"
});
formatter.result({
  "duration": 2389663069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 32
    }
  ],
  "location": "stepDefination.validation_are_as_per_expected(String)"
});
formatter.result({
  "duration": 519436,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify all internal links in documentation page",
  "description": "",
  "id": "applicaltion-validation;verify-all-internal-links-in-documentation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "documention page containing links",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "click on each links it navigate appropriate page and check status code",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "validation as per expected \"true\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the driver instance",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.documention_page_containing_links()"
});
formatter.result({
  "duration": 236880698,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.click_on_each_links_it_navigate_appropriate_page_and_check_status_code()"
});
formatter.result({
  "duration": 59858530597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 28
    }
  ],
  "location": "stepDefination.validation_as_per_expected(String)"
});
formatter.result({
  "duration": 380881,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.close_the_driver_instance()"
});
formatter.result({
  "duration": 2427194115,
  "status": "passed"
});
});