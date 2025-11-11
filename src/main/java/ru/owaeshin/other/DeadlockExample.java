package ru.owaeshin.other;

public class DeadlockExample {

    // Создаем два ресурса (объекта для блокировки)
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        System.out.println("Запускаем потоки, которые могут привести к deadlock...");

        // Поток 1: Сначала блокирует lock1, потом lock2
        Thread thread1 = new Thread(() -> {
            // Блок synchronized захватывает монитор объекта lock1
            synchronized (lock1) {
                System.out.println("Поток 1: заблокировал lock1");

                // Искусственная пауза, чтобы второй поток успел запустить и заблокировать lock2
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Поток 1: пытается заблокировать lock2...");
                // Поток 1 пытается захватить lock2, но он уже занят Потоком 2.
                // Поток 1 засыпает, ожидая освобождения lock2.
                synchronized (lock2) {
                    System.out.println("Поток 1: заблокировал lock2"); // Эта строка никогда не будет выполнена
                }
            }
        });

        // Поток 2: Сначала блокирует lock2, потом lock1 (противоположный порядок!)
        Thread thread2 = new Thread(() -> {
            // Блок synchronized захватывает монитор объекта lock2
            synchronized (lock2) {
                System.out.println("Поток 2: заблокировал lock2");

                System.out.println("Поток 2: пытается заблокировать lock1...");
                // Поток 2 пытается захватить lock1, но он уже занят Потоком 1.
                // Поток 2 засыпает, ожидая освобождения lock1.
                synchronized (lock1) {
                    System.out.println("Поток 2: заблокировал lock1"); // Эта строка никогда не будет выполнена
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
