# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java-based algorithms and data structures practice repository containing LeetCode problem solutions organized by topic/pattern. The project uses Maven for build management and JUnit 5 for testing.

## Build System

**Maven** (Java 17):
- Build: `mvn clean compile`
- Run all tests: `mvn test`
- Run a single test class: `mvn test -Dtest=ClassName`
- Run a single test method: `mvn test -Dtest=ClassName#methodName`

## Code Architecture

### Package Structure

Solutions are organized by algorithmic pattern/topic under `src/main/java/ru/owaeshin/`:
- `arrays/` - Array manipulation problems
- `binarys/` - Binary search problems
- `bst/` - Binary search tree problems
- `devideconquer/` - Divide and conquer algorithms
- `dp1d/` - 1D dynamic programming problems
- `hashmap/` - Hash map/hash table problems
- `intervals/` - Interval-based problems
- `linkedlist/` - Linked list problems
- `matrix/` - 2D matrix problems
- `pointers/` - Two pointer problems
- `slidingwindow/` - Sliding window problems
- `sort/` - Sorting algorithms
- `stack/` - Stack-based problems
- `other/` - Miscellaneous problems

Root package contains shared utility classes (e.g., `TreeNode.java`).

### Test Structure

Tests are located in `src/test/java/ru/owaeshin/` organized by difficulty:
- `easy/` - Tests for easy-level problems
- `medium/` - Tests for medium-level problems

Note: Test packages may not mirror the main package structure exactly (tests are organized by difficulty, not by topic).

### Solution Pattern

Each solution class:
- Contains a Javadoc comment with the LeetCode problem URL and description
- Implements the solution method(s) for that specific problem
- May be package-private (default access) or public

Tests use JUnit 5 (`@Test` annotations) and typically verify expected outputs with assertions.