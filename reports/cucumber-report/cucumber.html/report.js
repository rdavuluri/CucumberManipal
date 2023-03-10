$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BMICalculations.feature");
formatter.feature({
  "line": 1,
  "name": "BMI Calculations",
  "description": " Calculating BMI for five different users",
  "id": "bmi-calculations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Feature/Scenario Outline/Scenario/Datatable/Background"
    }
  ],
  "line": 7,
  "name": "Calculate BMI",
  "description": "",
  "id": "bmi-calculations;calculate-bmi",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Calculator url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "verify Calculator page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on BMI Calculator link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify BMI Calculator page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \u0027\u003cage\u003e\u0027, \u0027\u003cheight\u003e\u0027 and \u0027\u003cweight\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on Calculate button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the result",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "bmi-calculations;calculate-bmi;",
  "rows": [
    {
      "cells": [
        "age",
        "height",
        "weight"
      ],
      "line": 17,
      "id": "bmi-calculations;calculate-bmi;;1"
    },
    {
      "cells": [
        "10",
        "127",
        "40"
      ],
      "line": 18,
      "id": "bmi-calculations;calculate-bmi;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7474307200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Calculate BMI",
  "description": "",
  "id": "bmi-calculations;calculate-bmi;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Calculator url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "verify Calculator page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on BMI Calculator link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify BMI Calculator page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \u002710\u0027, \u0027127\u0027 and \u002740\u0027",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on Calculate button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the result",
  "keyword": "Then "
});
formatter.match({
  "location": "BMIStepDef.open_Calculator_url()"
});
formatter.result({
  "duration": 623939100,
  "status": "passed"
});
formatter.match({
  "location": "BMIStepDef.verify_Calculator_page()"
});
formatter.result({
  "duration": 34202200,
  "status": "passed"
});
formatter.match({
  "location": "BMIStepDef.user_click_on_BMI_Calculator_link()"
});
formatter.result({
  "duration": 29232200,
  "error_message": "java.lang.NoClassDefFoundError: com/rd/actions/Click\r\n\tat pageObjects.CalculatorPage.clickOnBMILink(CalculatorPage.java:34)\r\n\tat stepDefination.BMIStepDef.user_click_on_BMI_Calculator_link(BMIStepDef.java:31)\r\n\tat ✽.When user click on BMI Calculator link(BMICalculations.feature:10)\r\nCaused by: java.lang.ClassNotFoundException: com.rd.actions.Click\r\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:382)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:418)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:351)\r\n\tat pageObjects.CalculatorPage.clickOnBMILink(CalculatorPage.java:34)\r\n\tat stepDefination.BMIStepDef.user_click_on_BMI_Calculator_link(BMIStepDef.java:31)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BMIStepDef.verify_BMI_Calculator_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "127",
      "offset": 13
    },
    {
      "val": "40",
      "offset": 23
    }
  ],
  "location": "BMIStepDef.enter_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BMIStepDef.user_click_on_Calculate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BMIStepDef.user_verify_the_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 771266600,
  "status": "passed"
});
});