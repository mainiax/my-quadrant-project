# Quadrants Android Application

Welcome to the **Quadrants** project! This Android application demonstrates various Jetpack Compose concepts by displaying information about common composable functions in a modern, visually appealing layout. The app divides the screen into four equal quadrants—each showcasing a different composable function along with a brief description.

## Table of Contents

- [About](#about)
- [Features](#features)
- [UI Specifications](#ui-specifications)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Future Enhancements](#future-enhancements)
- [Contact](#contact)

## About

This project was built as an exercise to explore Jetpack Compose. It demonstrates how to:

- Use layout components such as **Row** and **Column** to split the screen into equal parts.
- Apply modifiers like `padding`, `background`, and `weight` to create responsive UIs.
- Center content both vertically and horizontally.
- Style text with properties such as `FontWeight.Bold` and `TextAlign.Justify`.

Each quadrant provides the name of a composable function along with a one-sentence description of its purpose.

## Features

- **Equal Quadrant Layout:** Divides the screen into four equally sized quadrants.
- **Custom Padding:** Applies a 16dp padding around each quadrant.
- **Centered Content:** Vertically and horizontally centered content within each quadrant.
- **Text Styling:** 
  - The title text is displayed in bold with 16dp bottom padding.
  - The description text uses justified alignment and a default font size.
- **Custom Colors:** Each quadrant is assigned a unique color:
  - `Color(0xFFEADDFF)`
  - `Color(0xFFD0BCFF)`
  - `Color(0xFFB69DF8)`
  - `Color(0xFFF6EDFF)`

## UI Specifications

- **Screen Division:** The screen is divided into two rows. Each row contains two quadrants, ensuring all four quadrants have equal size.
- **Quadrant Content:**  
  - **Text composable:** Displays text following Material Design guidelines.
  - **Image composable:** Draws an image using a Painter class object.
  - **Row composable:** Arranges children horizontally.
  - **Column composable:** Arranges children vertically.
- **Styling Guidelines:**
  - Each quadrant has a uniform padding of 16dp on all sides.
  - Content within each quadrant is centered.
  - The first text (title) is bold with a 16dp bottom padding.
  - The second text (description) uses the default font size and is justified.

## Technologies

- **Kotlin** – Primary programming language.
- **Jetpack Compose** – UI toolkit for building native Android UIs.
- **Android Studio** – IDE for Android development.
- **Material3** – Utilized for Material Design components.

## Getting Started

To run this project locally:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/mainiax/my-quadrant-project.git
   cd my-quadrant-project
