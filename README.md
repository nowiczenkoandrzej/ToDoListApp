# Android  - Implementing a to-do list using the RecyclerView.

## Introduction
Create a simple to-do list where each item is a list item in the `RecyclerView`.
Each item should have two elements:
a task description (*get milk*, etc.) and
a check box for indicating the completion of the task.

The list items will be stored in the *model data* which is ready for usage.
A predefined list of to-do items is provided for usage.
In order to layout each item correctly, use the `TextView`.



## Problem Statement
Complete each of the following tasks to ensure success:

1) Add a `CheckBox` control with this specific ID (`doneCheckBox`) in the layout for each item.

2) Implement the `RecyclerView` adapter methods, `onCreateViewHolder`, `onBindViewHolder`, `getItemCount` to display items in the UI.

3) Implement the `click listener` for the `Checkbox` so the model data is updated accordingly when a user clicks on it, i.e. if the checkbox is checked, it means the to-do item/task is done.

## Note

Please be careful when editing the `build.gradle` in your project. This task does not require any changes. It is generally acceptable to add new dependencies but changing or removing existing dependencies or configuration can cause the project and verification tests to function in an unexpected way and give an unreliable result.
