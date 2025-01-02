Family Tree Generator in C++

Problem Statement This program allows users to interactively build and visualize a hierarchical family tree. Users can add family members, specify parent-child relationships, and visualize the structure of the tree in an ASCII-based format.

Features: Add family members with a name and birthdate. Create parent-child relationships within the tree. Visualize the family tree using ASCII hierarchy. Input validation and error handling for user-friendly experience. Support for multiple generations. Motivation Educational Purposes This project serves as a learning exercise, focusing on applying data structures like trees in a real-world scenario. It's designed to help developers improve their understanding of hierarchical data organization and management.

Problem-Solving and Algorithmic Thinking Building a family tree generator presents challenges in managing data relationships, user input, and visualizing complex hierarchies, which improves problem-solving skills and algorithmic thinking.

User-Friendly Interface The program is designed to be accessible to users with limited technical knowledge, providing clear instructions, feedback, and error messages.

Personal and Cultural Significance Family trees are valuable for documenting relationships across generations, and this program can help individuals understand their ancestry and preserve family history.

Practical Application in Genealogy The generator can assist genealogists and historians in organizing and analyzing complex family relationships, contributing to the study of genealogy and historical records.

Solution Description Algorithm Individual Class:

Private attributes for name, birthdate, and a vector of children. Methods for adding a child, and accessing name, birthdate, and children. FamilyTree Class:

Private root individual. Methods for adding family members and visualizing the tree. Main Function:

Create an instance of the FamilyTree class. Initialize a vector of pointers to individuals. Display a main menu with options to add a family member, visualize the tree, or exit. Handle user input and perform corresponding actions. Menu Options: Add Family Member:

Prompts for parent's name, child's name, and birthdate. Searches for the parent and adds the child to the tree. Displays a success message. Visualize Family Tree:

Displays the family tree in ASCII format. Exit:

Exits the program with a goodbye message. Error Handling: Invalid choices prompt the user to re-enter valid input.
