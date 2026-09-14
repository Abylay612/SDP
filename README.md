# Assignment 1: Builder Pattern (Game Character)

## Project Overview
This project demonstrates the **Builder Pattern** (GoF) implemented in Java for a game domain. The primary goal is to separate the construction of a complex `Character` object from its internal representation, allowing step-by-step creation, input validation, and reusable pre-configured characters.

---

## Project Architecture
The codebase strictly adheres to the 4-component Gang of Four (GoF) Builder structure:

1. **`Character` (Product):** The target complex object containing character attributes (name, class, level, health, mana, weapon, armor). It is fully immutable.
2. **`CharacterBuilder` (Builder):** Encapsulates the step-by-step construction logic, implements Fluent API, and validates data state before instantiation.
3. **`CharacterDirector` (Director):** Manages pre-configured character setups (e.g., Warrior, Mage) using a `CharacterBuilder` instance.
4. **`Main` (Client):** Demonstrates object creation using both custom `CharacterBuilder` calls and pre-configured `CharacterDirector` presets.

---

## 5 Clean Code Principles Applied

### 1. Meaningful and Intention-Revealing Names
Classes, variables, and methods clearly express their exact domain purpose. Method names like `constructWarrior()` or `validateCharacterState()` immediately describe what action they perform.

### 2. Encapsulation and Immutability
The `Character` class uses `private final` fields and provides only getter methods. Once constructed via `.build()`, a `Character` object cannot be modified, preventing unexpected side effects across the codebase.

### 3. Small Methods with Single Responsibility (SRP)
Each class and method does exactly one thing:
- `Character` holds data.
- `CharacterBuilder` configures and constructs.
- `CharacterDirector` manages presets.
- Validation logic is isolated into a dedicated private method (`validateCharacterState()`).

### 4. Validated Construction & Fail-Fast Approach
The builder prevents the instantiation of invalid domain objects. Setters check range boundaries (e.g., positive health, level >= 1), and `build()` throws an `IllegalStateException` if mandatory fields like character name are missing.

### 5. Fluent API and Avoidance of Magic Values
Setters in `CharacterBuilder` return `this`, enabling clean method chaining. Default state parameters are explicitly defined in the `reset()` method rather than hardcoded as "magic values" throughout the application logic.