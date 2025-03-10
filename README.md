# Design Patterns
## Types of Design Patterns
1. Creational Design Patterns
2. Structural Design Patterns
3. Behavioral Design Patterns

## Creational Design Patterns
1. Singleton
2. Factory Method
3. Abstract Factory

## Structural Design Patterns
1. Decorator
2. Bridge
3. Composite

## Behavioral Design Patterns
1. Observer
2. Strategy
3. Command

## Strategy Design Pattern
- Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
- Strategy pattern is also known as Policy Pattern.

### Structure
1. **Context**: It maintains a reference to the strategy object.
2. **Strategy**: It is an interface common to all supported algorithms.
3. **ConcreteStrategy**: It implements the algorithm using the Strategy interface.

### Example
- Suppose we have a `Vehicle` interface and we have two strategy implementations for this interface `Car` and `Bike`.
- We are going to define a `Vehicle` interface and `Car` and `Bike` classes implementing this interface.
- We are going to define a `VehicleStrategy` interface and `CarStrategy` and `BikeStrategy` classes implementing this interface.
- We are going to define a `VehicleContext` class that will use the `VehicleStrategy` interface.

### Vehicle.py
```python
from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive(self):
        pass
```

### Car.py
```python
from Vehicle import Vehicle

class Car(Vehicle):
    def drive(self):
        print("Driving Car")
```

### Bike.py
```python
from Vehicle import Vehicle

class Bike(Vehicle):
    def drive(self):
        print("Driving Bike")
```

### VehicleStrategy.py
```python
from abc import ABC, abstractmethod

class VehicleStrategy(ABC):
    @abstractmethod
    def drive(self):
        pass
```

### CarStrategy.py
```python
from VehicleStrategy import VehicleStrategy

class CarStrategy
    def drive(self):
        print("Driving Car")
```

### BikeStrategy.py
```python
from VehicleStrategy import VehicleStrategy

class BikeStrategy
    def drive(self):
        print("Driving Bike")
```

### VehicleContext.py
```python
from VehicleStrategy import VehicleStrategy

class VehicleContext:
    def __init__(self, vehicle_strategy: VehicleStrategy):
        self.vehicle_strategy = vehicle_strategy

    def drive(self):
        self.vehicle_strategy.drive()
```

### main.py
```python
from Car import Car
from Bike import Bike
from VehicleContext import VehicleContext

car = Car()
bike = Bike()

vehicle_context = VehicleContext(car)
vehicle_context.drive()

vehicle_context = VehicleContext(bike)
vehicle_context.drive()
```

### Output
```
Driving Car
Driving Bike
```
