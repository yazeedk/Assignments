# Assignment 3

I worked on a system using Observer and Decorator Design Patterns. First, I achieved the Observer Design Pattern as follows:

create desplay, update into WeatherDataObserver interface, StatisticsDisplay and CurrentConditionsDisplay was implements from WeatherDataObserver interface and override the desplay and update method, and use it to update the subject for all observers. 

WeatherDataObserver and  CurrentConditionsDisplay does display the information by add the statement for update, and display it from display method. 

WeatherDataSubject class has implements from IWeatherDataSubject, and has do the observers operations, like remove, notify registerd observers. 

i make the system flixeble, for future easy to add, remove for obserers. 
and i add an interface and the concrete class implements from it, to be able to add any concrete weather type for future.


for Decorate, i created IWeatherConditionsDecorator interface, and all decorate classes has implements from this interface, that make the system more flexible, like its easy to be add any decorate class for any weather type. 
and i make the IWeatherConditionsDecorator interface extends from WeatherDataObserver interface , to use the same update method and update any information to be up to date for all system



## output : 
![399187191_279476348398838_229034934674904711_n](https://github.com/yazeedk/Assignments/assets/36983323/3ca605cc-e505-4795-8cd1-336015c154b8)

![Untitled Diagram](https://github.com/yazeedk/Assignments/assets/36983323/f90da478-b9e3-4c1e-8744-50e344dcfe05)
