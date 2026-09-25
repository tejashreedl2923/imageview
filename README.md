# Experiment 7

## Create an Adaptive UI using ListView and ImageView

This Android application demonstrates the creation of an adaptive user interface using ListView and ImageView. The application displays student information in a structured and scrollable list with student names, USNs, courses, subjects, and corresponding icons.

The project demonstrates important Android development concepts including ListView, ImageView, Custom Adapter, XML layouts, Kotlin, event handling, and adaptive UI design.

---

## Aim

To create an adaptive Android user interface using ListView and ImageView to display student information in a structured and scrollable format.

---

## Objectives

- To understand the use of ListView in Android.
- To understand the use of ImageView in Android.
- To create a custom layout for ListView items.
- To implement a Custom Adapter.
- To display multiple student records dynamically.
- To handle ListView item click events.
- To create an adaptive user interface using Android layout properties.

---

## Features

- Student Explorer interface
- Experiment title display
- Scrollable student list
- Student name display
- USN display
- Course display
- Subject display
- ImageView for each student
- Custom ListView item layout
- Custom Adapter implementation
- Clickable student entries
- Toast message when a student is selected
- Adaptive layout for different screen sizes

---

## Technologies Used

| Technology | Purpose |
|---|---|
| Kotlin | Application programming |
| Android Studio | Development environment |
| XML | User interface design |
| Android SDK | Android application development |
| ListView | Displaying a scrollable list |
| ImageView | Displaying images and icons |
| Custom Adapter | Connecting data with ListView |
| Toast | Displaying selection messages |

---

## Project Structure

    imageview/
    |
    +-- app/
    |   |
    |   +-- src/
    |       |
    |       +-- main/
    |           |
    |           +-- java/com/example/imageview/
    |           |   |
    |           |   +-- MainActivity.kt
    |           |   +-- CustomAdapter.kt
    |           |
    |           +-- res/
    |           |   |
    |           |   +-- drawable/
    |           |   |
    |           |   +-- layout/
    |           |       |
    |           |       +-- activity_main.xml
    |           |       +-- list_item.xml
    |           |
    |           +-- AndroidManifest.xml
    |
    +-- README.md

---

## Application Workflow

    START
      |
      v
    Main Activity
      |
      +-- Display Student Explorer Title
      |
      +-- Display Experiment Title
      |
      v
    ListView
      |
      v
    Custom Adapter
      |
      v
    List Item Layout
      |
      +-- Display Student Image
      |
      +-- Display Student Name
      |
      +-- Display USN
      |
      +-- Display Course
      |
      +-- Display Subject
      |
      v
    User Selects Student
      |
      v
    Toast Message
      |
      v
    END

---

## Main Activity

`MainActivity.kt` is the starting screen of the application.

The user interface contains the Student Explorer title, Experiment 7 subtitle, and the ListView.

The Main Activity stores the student information and passes it to the Custom Adapter.

The following information is maintained for each student:

- Student name
- USN
- Course
- Subject
- Image resource

The ListView is populated using the `CustomAdapter`.

---

## Custom Adapter

`CustomAdapter.kt` is used to connect the student data with the ListView.

The adapter receives:

- Student names
- Student USNs
- Course information
- Subject information
- Image resources

The adapter creates each student item using `list_item.xml`.

The Custom Adapter is responsible for assigning the appropriate data to the ImageView and TextViews for each position in the list.

---

## Main Layout

The `activity_main.xml` file defines the main user interface.

The main layout contains:

- Student Explorer title
- Experiment 7 - Adaptive UI subtitle
- ListView

The ListView occupies the available remaining screen space.

The layout uses adaptive properties such as:

- `match_parent`
- `wrap_content`
- `layout_weight`
- `dp`
- `sp`

---

## List Item Layout

The `list_item.xml` file defines the appearance of each individual student entry.

Each item contains:

- ImageView
- Student name
- USN
- Course
- Subject

The layout places the ImageView on the left and the student information on the right.

---

## Student Data

| Name | USN | Course | Subject |
|---|---|---|---|
| Tejashree | 25MCAR0124 | MCA | Android Development |
| Tharun | 25MCAR0101 | MCA | Database Management |
| Swathi | 25MCAR0102 | MCA | Web Development |
| Dhriti | 25MCAR0103 | MCA | Cloud Computing |
| Harshini | 25MCAR0104 | MCA | Artificial Intelligence |
| Charitha | 25MCAR0105 | MCA | Software Engineering |

---

## ListView

ListView is an Android UI component used to display multiple items in a vertically scrollable list.

In this application, the ListView displays the complete list of students.

The ListView receives the student information from the Custom Adapter.

The data flow is:

    Student Data
         |
         v
    CustomAdapter
         |
         v
       ListView
         |
         v
    Student Items

---

## ImageView

ImageView is an Android UI component used to display images or icons.

In this application, an ImageView is included in every ListView item to display an icon associated with the student entry.

---

## Item Click Handling

The application implements an item click listener for the ListView.

When the user selects a student, a Toast message displays the selected student's name.

For example:

    Tejashree selected

The same functionality is available for all students in the list.

---

## Adaptive UI

The application uses adaptive Android layout properties to make the interface flexible across different screen sizes.

The following properties are used:

### match_parent

`match_parent` allows a view to occupy the available space provided by its parent.

### wrap_content

`wrap_content` allows a view to occupy only the amount of space required by its content.

### layout_weight

`layout_weight` is used to distribute available space between views.

### dp

`dp` or density-independent pixels are used for dimensions such as padding, margins, width, and height.

### sp

`sp` or scale-independent pixels are used for text sizes.

These properties help the interface adjust according to different screen sizes and orientations.

---

## User Interface

The application displays the following structure:

    Student Explorer

    Experiment 7 - Adaptive UI

    [Icon]  Tejashree
            USN: 25MCAR0124
            Course: MCA
            Subject: Android Development

    [Icon]  Tharun
            USN: 25MCAR0101
            Course: MCA
            Subject: Database Management

    [Icon]  Swathi
            USN: 25MCAR0102
            Course: MCA
            Subject: Web Development

    [Icon]  Dhriti
            USN: 25MCAR0103
            Course: MCA
            Subject: Cloud Computing

    [Icon]  Harshini
            USN: 25MCAR0104
            Course: MCA
            Subject: Artificial Intelligence

    [Icon]  Charitha
            USN: 25MCAR0105
            Course: MCA
            Subject: Software Engineering

The ListView allows the user to scroll through the complete list of students.

---

## Testing

| Test Case | Input or Action | Expected Result |
|---|---|---|
| 1 | Launch the application | Student Explorer screen is displayed |
| 2 | View the ListView | Student records are displayed |
| 3 | Scroll the ListView | All student records can be viewed |
| 4 | Select Tejashree | Tejashree selected message is displayed |
| 5 | Select Tharun | Tharun selected message is displayed |
| 6 | Select Swathi | Swathi selected message is displayed |
| 7 | Select Dhriti | Dhriti selected message is displayed |
| 8 | Select Harshini | Harshini selected message is displayed |
| 9 | Select Charitha | Charitha selected message is displayed |
| 10 | Rotate the device | UI adjusts according to the screen orientation |
| 11 | Run on different screen sizes | ListView remains usable and properly arranged |
---


## Screenshots

<img width="1332" height="673" alt="Screenshot 2026-09-25 233732" src="https://github.com/user-attachments/assets/822af841-87f8-4d66-8460-ef72dc432bac" />
<img width="718" height="1598" alt="image" src="https://github.com/user-attachments/assets/c84179ad-c477-4ef2-9aa5-a158545fbc3a" />
<img width="718" height="1598" alt="image" src="https://github.com/user-attachments/assets/ee2c14bc-6f05-45d8-9866-7604fb0df8a0" />
<img width="718" height="1598" alt="image" src="https://github.com/user-attachments/assets/b57fc451-d47d-4952-994f-b046d387ab88" />
<img width="718" height="1598" alt="image" src="https://github.com/user-attachments/assets/e03efdf0-799c-4e9e-a6fd-6dc159c43c9f" />


## Android Concepts Demonstrated

### Activity

An Activity represents a screen in an Android application.

This project uses `MainActivity` as the main screen of the application.

### ListView

ListView is used to display a collection of student records in a vertically scrollable list.

### ImageView

ImageView is used to display an image or icon for each student.

### Adapter

The Adapter connects the student data with the ListView.

### Custom Adapter

The Custom Adapter allows the application to use a custom XML layout for every ListView item.

### XML Layout

XML is used to define the structure and appearance of the application's user interface.

### Toast

Toast is used to display a short message when a student is selected.

---

## Complete Application Flow

    MainActivity
         |
         v
    activity_main.xml
         |
         v
       ListView
         |
         v
    CustomAdapter
         |
         v
      list_item.xml
         |
         +----> ImageView
         |
         +----> Student Name
         |
         +----> USN
         |
         +----> Course
         |
         +----> Subject
         |
         v
    Display Student List
         |
         v
    User Clicks Student
         |
         v
    Toast Message


## Expected Output

After successfully running the application, the Student Explorer screen displays the six student records with their corresponding icons and information.

The user can scroll through the list and select any student. A Toast message is displayed containing the selected student's name.

---

## Result

The adaptive Android user interface was successfully developed using ListView and ImageView. A Custom Adapter was implemented to display the student information of Tejashree, Tharun, Swathi, Dhriti, Harshini, and Charitha in a structured and scrollable list. The application successfully demonstrates custom ListView layouts, ImageView usage, item click handling, and adaptive UI design.
```
