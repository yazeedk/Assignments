# Assignments

![Company](https://github.com/yazeedk/Assignments/assets/36983323/4f5b899f-2a56-4d41-9f1e-a03e5dfe2b25)



I achieved Solid Principles, and I did it like this:
-
1- Single Responsibility Principle:
Each class contains only the information and operations that related to the same class topic and no other information.

- Open-Closed Principle:
 I acheived this Principle. 
An example of this is: 
I created an interface for the report, and the various types of reports perform implemens from it. 
If I want to add a new type of report in the future, I only have to add a new class called the Report Employments type from the interface.

- Liskov Substitution Principle: 
I can change the parent and son classes, so that I can make the director as the parent class of the user and the user class as the son of the director class, 
because the director contains all the characteristics of the user.



- Interface Segregation Principle: 
All types of reports implements into one interface, to make adding a new type of report more easy.


- Dependency Inversion Principle: 
I achieved the Dependency  principle  by placing the categories in different packages. 
For example, I placed the categories related to the user in the user package.
Which concerns the report and everything related to it, I placed it in the report package.
And Data base i put it in a separate package called Data Base

![image](https://github.com/yazeedk/Assignments/assets/36983323/a4602463-eb07-4216-9835-d007f352b5d3)

 



- Some challenges:
To make the system more flexible to add a new report type, create each report type in a separate class, and implement each class of "IReport"
