$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
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
  "duration": 229696907167,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.compare_the_title_actual_with_expected()"
});
formatter.result({
  "duration": 100624976,
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
  "duration": 12347270,
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
  "duration": 25738541,
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
  "duration": 28943675238,
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
  "duration": 499479,
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
  "name": "Iterate all documention section link one by one",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "close the driver instance",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.documention_page_containing_links()"
});
formatter.result({
  "duration": 453884615,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.click_on_each_links_it_navigate_appropriate_page_and_check_status_code()"
});
formatter.result({
  "duration": 1252889382603,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d79.0.3945.88)\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027BALU\u0027, ip: \u0027172.18.123.5\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.88, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\Talaneru\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61033}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 57c759b2c06a3fc056988c3bc9db791a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:325)\r\n\tat stepDefinations.stepDefination.click_on_each_links_it_navigate_appropriate_page_and_check_status_code(stepDefination.java:161)\r\n\tat ✽.When click on each links it navigate appropriate page and check status code(Login.feature:22)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.iterate_all_documention_section_link_one_by_one()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.close_the_driver_instance()"
});
formatter.result({
  "status": "skipped"
});
});