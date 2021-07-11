Feature: feature to test Sing In without Account

Scenario: Validate Sing In is working
Given user is on automationpractise home page
And user clicks on signIn tab
When automationpractise page redirects to authentication page
And  user enters Email address and enters Password
And clicks on Sign in button
Then user is redirected to Authentification failler error


