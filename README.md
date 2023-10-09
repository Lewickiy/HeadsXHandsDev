# HeadsXHandsDev
Players'n'Monsters console game

Условия:
1. В игре есть Существа. К ним относятся Игрок и Монстры.
2. У Существа есть параметры Атака и Защита. Это целые числа от 1 до 30.
3. У Существа есть Здоровье. Это натуральное число от 0 до N.
   - Если Здоровье становится равным 0, то Существо умирает.
   - Игрок может себя исцелить до 4-х раз на 30% от максимального Здоровья.
4. У Существа есть параметр Урон. Это диапазон натуральных чисел M - N. Например, 1-6.
5. Одно Существо может ударить другое по такому алгоритму:
   - Рассчитываем Модификатор атаки. Он равен разности Атаки атакующего и Защиты защищающегося плюс 1
   - Успех определяется броском N кубиков с цифрами от 1 до 6, где N - это Модификатор атаки. Всегда бросается хотя бы один кубик.
   - Удар считается успешным, если хотя бы на одном из кубиков выпадает 5 или 6
   - Если удар успешен, то берется произвольное значение из параметра Урон атакующего и вычитается из Здоровья защищающегося.

6. Все сущности должны быть написаны и спроектированы в ООП стиле. Объекты обязательно должны реагировать на некорректные аргументы методов.
7. В вашей программе обязательно должны получиться классы сущностей Игрок и Монстр. Наличие дополнительных классов по вашему желанию.

Результатом должно стать приложение с реализацией классов и примером их использования.
