package academy.tochkavhoda.introduction;

public class FirstSteps {

    public int sum (int x, int y) {
        return x + y;
    }

    public int mul (int x, int y) {
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y) {
        return x % y;
    }

    public boolean isEqual (int x, int y) {
        return x == y;
    }

    public boolean isGreater (int x, int y) {
        return x > y;
    }

    /* 7. Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop)
    и правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз.
    Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom.
    Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false.
    Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.*/

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        if((xLeft<=x)&&(x<=xRight)&&(yTop<=y)&&(y<=yBottom))
            return true;

        else
            return false;
    }

    /* 8. Возвращает сумму чисел, заданных одномерным массивом array.
    Для пустого одномерного массива возвращает 0. */
    public int sum(int[] array) {

            int sum = 0;
        if (array.length==0)
            return 0;
        else {
            for (int i = 0; i < array.length; i++) {
                sum += i;
            }
            return sum;
        }
    }

    /* 9. Возвращает произведение чисел, заданных одномерным массивом array.
    Для пустого одномерного массива возвращает 0.*/

    public int mul(int[] array) {

        int mul=1;
        if(array.length==0) return 0;
        else {
            for (int i = 0; i < array.length; i++) {
                mul *= array[i];
            }
            return mul;
        }
    }

    /*10. Возвращает минимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива
    возвращает Integer.MAX_VALUE. */

    public int min(int[] array) {

        if(array.length==0) return Integer.MAX_VALUE;
        else {
            int min=array[0];
            for (int i = 1; i < array.length; i++)
                if(array[i]<min) min=array[i];
            return min;
        }
    }


    /*11. Возвращает максимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива
    возвращает Integer.MIN_VALUE. */

    public int max(int[] array) {

        if(array.length==0) return Integer.MIN_VALUE;
        else {
            int max=array[0];
            for (int i = 1; i < array.length; i++)
                if(array[i]>max) max=array[i];
            return max;
        }
    }


    /*12. Возвращает среднее значение для чисел, заданных одномерным массивом array. Для пустого одномерного массива
    возвращает 0. */

    public double average(int[] array) {
        double sum=0;
        if(array.length==0) return 0;
        else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum/array.length;
        }
    }

    /*13. Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false. Пустой одномерный
    массив считается упорядоченным. */

    public boolean isSortedDescendant(int[] array) {

        for(int i = 0; i < array.length-1; i++) {
            if (array[i]<=array[i+1]) return false;
        }
        return true;
    }

    /*14. Возводит все элементы одномерного массива array в куб. */

    public void cube(int[]array) {

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow(array[i], 3);
        }
    }

    /*15. Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false. */

    public boolean find(int[]array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==value) return true;
        }
        return false;
    }


    /*16. Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы. */

    public void reverse(int[]array) {

        for(int i = 0; i < array.length/2; i++) {
            int a = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=a;
        }
    }


    /*17. Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив считается палиндромом. */

    public boolean isPalindrome(int[]array) {

        if(array.length==0) return true;
        else {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - 1 - i]) return false;
            }
            return true;
        }
    }


    /*18. Возвращает сумму чисел, заданных двумерным массивом matrix. */

    public int sum(int[][] matrix) {

        int sum=0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        return sum;
    }


    /*19. Возвращает максимальное из чисел, заданных двумерным массивом matrix. Для пустого двумерного массива
    возвращает Integer.MIN_VALUE. */

    public int max(int[][] matrix) {

        if (matrix[0].length == 0) return Integer.MIN_VALUE;
        else {
            int max = matrix[0][0];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    if (matrix[i][j] > max) max = matrix[i][j];
            return max;
        }
    }


    /*20. Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix.
    Для пустого двумерного массива возвращает Integer.MIN_VALUE. */

    public int diagonalMax(int[][] matrix) {

        if (matrix[0].length == 0) return Integer.MIN_VALUE;
        else {
            int max = matrix[0][0];
            for (int i = 1; i < matrix.length; i++)
                if (matrix[i][i] > max) max = matrix[i][i];
            return max;
        }
    }


    /*21. Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false.
    Пустая строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов.
    При написании метода рекомендуется внутри него вызвать метод из п. 13. */

    public boolean isSortedDescendant(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++)
            if(!isSortedDescendant(matrix[i])) return false;
        return true;
    }

}
