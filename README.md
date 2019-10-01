# huaweiWebApp

This application aims to create a to-do list, with Java back-end and HTML-JS front-end

<h1>Explanation of JavaScript functions (by appereance order):</h1>

<b>function addNewTaskList():</b> This function creates a new task list for the logged in user. It takes "username" from local storage of browser, and task list "name" directly from user via prompt. Then it combines these two parameters in a form object and send an http request, while using this form object as body.


<b>function getAllUsers():</b> This function returns all registered users and logs them in to the console. This function simply does a GET request.

<b>function register():</b> This function takes parameters from "input" elements, and POST them to the web service.

<b>function createTable(response):</b> This function takes an "User" object, then builds few "select" elements (to choose task list to present or to filter tasks from task list) and also a table to present current tasks from selected task list. It also create a button to add new task to the selected task list.

It also handles the events, such as "click" event of "addTask" button, and "change" event of filtering "select" element. 

<b>function taskListDelete():</b> This function takes the selected task list, and deletes that.

<b>function login():</b> This function handles the login process. It also creates a "select" element to choose which task list to show.

<b>function logout():</b> This function handles the logout process. It clears the screen (table, buttons and select elements) and shows the first login screen.

<b>function sortByProperty(property):</b> This function sorts an array by given "property".

<h1>Explanation of Java Classes (by appereance order):</h1>

<b>Class Task, Class TaskList Class User:</b> These two classes defines the object properties.

<h3>UserController</h3>

<b>ResponseEntity<ArrayList<User>> getAllUsers():</b> This function simply returns all users.

<b>User getUser(@PathVariable int id):</b>This function returns a specific user. Works with id.

<b>ResponseEntity<User> login(String username, String password):</b> This function takes a username and a password and checks if there is a corresponding user, according to these parameters.
  
<b>ResponseEntity<User> register(String username, String password):</b> This function checks if the username available and then, if it is, it registers that user.
  

<h3>TaskController</h3>

<b>ResponseEntity<String> addTaskList(String username, String name):</b> This function adds new task list with given name, to the given "username".
  
<b>ResponseEntity<String> addTask(String username, String name, String description, String date, int id):</b> This function creates a new task with given informations and add this task to given "username"s "id" numbered task list.

<b>ResponseEntity<String> deleteTaskList(String username, int id):</b> This function deletes the task with the given "id" from given "username"s record.
  
  <b>ResponseEntity<String> deleteTask(String username, String name, int id):</b> This function deletes the task with given "name" from "id" numbered task list from "username" records. 
