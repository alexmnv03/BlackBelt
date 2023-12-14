#  copyOnWriteArraylist


copyOnWriteArraylist служит для замены Arraylist в многопточке, она имплементирет List

copyOnWriteArraylist - следует использовать когда у вас небольшойе кол-во операций по изменению элементов и болшое кол-во по их чтению.

copyOnWriteArraylist это тот же Arraylist с алгоритмом copyOfWrite, т.е. при каждом изменнеии элементов коллекции создается клон списка.

Рассмотрим пример OldArraylistTest с обычным Arraylist и видим что мы получаем ошибку

Препишем наш пример на СopyOnWriteArraylistTest

На этом примере мы видим, что это очень тяжелый класс, т.к. каждый раз создаются копии обьектов

Есть аналогичный класс CopyOnWriteArraySet 

