# Day 4 - Multithreading and Concurrency

Welcome to Day 4 of the Java training program at La Plateforme! This day focuses on multithreading and concurrency. Throughout the day, I explored various concepts related to multithreading and concurrency in Java and completed several exercises to solidify my understanding.

## My Day 4 Accomplishments

Here's a summary of the tasks I completed today, each designed to enhance my skills in multithreading and concurrency:

### Job 01 - Simple Thread

- Created a class `SimpleThreadExercice` to demonstrate the use of a simple thread.
- The thread prints "Salut du thread!" five times with a one-second interval between each print.

### Job 02 - Runnable Interface

- Developed a class `RunnableInterfaceExercice` to showcase the implementation of the `Runnable` interface.
- The thread prints "En cours d'exécution..." five times with a one-second interval.

### Job 03 - Synchronization

- Designed a class `SynchronizationExercice` to simulate a bank scenario with initial balance and withdrawal amount as arguments.
- Utilized `synchronized` methods to prevent concurrency issues.
- Created two threads to withdraw a specified amount simultaneously.

### Job 04 - Callable and Future

- Implemented a class `CallableFutureExercice` to multiply two numbers provided as arguments using the `Callable` interface.
- Utilized `Future` to retrieve the result.

### Job 05 - Executor Service

- Created a class `ExecutorServiceExercice` to manage a thread pool using `ExecutorService`.
- Executed tasks to multiply an argument by a specified factor in parallel.

### Job 06 - Locks

- Developed a class `LockExercice` similar to the synchronization exercise, but this time with an initial balance and withdrawal amount as arguments.
- Employed `ReentrantLock` to ensure thread safety.

### Job 07 - Thread Interruption

- Designed a class `ThreadInterruptionExercice` to create a thread that sleeps for a specified number of seconds and interrupts it after half of the specified time.
- Demonstrated the use of `interrupt()` to halt a sleeping thread prematurely.

## Key Takeaways

- Expanded knowledge of multithreading and concurrency in Java.
- Practiced creating threads using both `Thread` and `Runnable` interfaces.
- Applied synchronization and locks to manage thread safety.
- Utilized `Callable` and `Future` for asynchronous task execution.
- Managed thread pools using `ExecutorService`.

These exercises have equipped me with essential skills for developing efficient and concurrent Java applications. I'm excited to continue exploring more advanced topics in the days to come!

Thank you for following my Java journey at La Plateforme!
