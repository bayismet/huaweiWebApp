# huaweiWebApp

This application aims to create a to-do list, with Java back-end and HTML-JS front-end

Explanation of JavaScript functions (by appereance order):

function addNewTaskList(): This function creates a new task list for the logged in user. It takes "username" from local storage of browser, and task list "name" directly from user via prompt. Then it combines these two parameters in a form object and send an http request, while using this form object as body.


function getAllUsers(): This function returns all registered users and logs them in to the console. This function simply does a GET request.

function register(): This function takes parameters from "input" elements, and POST them to the web service.

function createTable(response): This function takes an "User" object, then builds few "select" elements (to choose task list to present or to filter tasks from task list) and also a table to present current tasks from selected task list. It also create a button to add new task to the selected task list.

It also handles the events, such as "click" event of "addTask" button, and "change" event of filtering "select" element. 

function taskListDelete(): This function takes the selected task list, and deletes that.

function login(): This function handles the login process. It also creates a "select" element to choose which task list to show.

function logout(): This function handles the logout process. It clears the screen (table, buttons and select elements) and shows the first login screen.

function sortByProperty(property): This function sorts an array by given "property".


