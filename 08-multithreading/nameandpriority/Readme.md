# Рассмотрим методы потоков

По умолчанию имена потоков будут такие, а приоритет 5
        // Name MyThreadOne = Thread-0 
        // priority of MyThreadOne = 5 - default
        // Name MyThreadOne = Thread-1
        // priority of MyThreadOne = 5

Но даже если мы дадим потоку более высокий приоритет, не ни какой гаранитии, что он запустится раньше потока с более низким приоритетом

