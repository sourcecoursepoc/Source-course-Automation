
Feature: Create Project

Scenario: Validate Save Project

Given User launch application

When User navigate to home page

And User navigate to compose page

And User add a Schema with name"<Schemaname>"

And User add a Group

When User save a group

Then User should be able save the project 

Examples:

|Schemaname|
|ITEM|
