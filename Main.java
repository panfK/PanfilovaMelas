

        import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int a,b,c;
                Scanner sin = new Scanner(System.in);
                System.out.println("ну что, начнём?");
                a=2;
                while (a == 2) {
                    System.out.println("какое задание вы хотели бы проверить?");
                    System.out.println("1-3=задания 4=закончить проверку заданий");
                    b = sin.nextInt();
                    c = 1;
                    if (b == 1) {
                        while (c == 1) {
                            double x, y, sum;
                            System.out.println("Введите координату x");
                            x = sin.nextDouble();
                            if (x < 0) {
                                x = x * (-1);
                            }
                            System.out.println("Введите координату у");
                            y = sin.nextDouble();
                            if (y < 0) {
                                y = y * (-1);
                            }
                            sum = (x + y);
                            if (sum > 1) {
                                System.out.println("Число входит в зону");
                            } else {
                                System.out.println("Чичло не входит в зону");
                            }
                            System.out.println("перепроверим задание?");
                            System.out.println("1-да 2-нет");
                            c = sin.nextInt();
                        }
                    }
                    else if (b == 2) {
                        while (c == 1) {
                            int dt, t, d, minutes;
                            double sm, s;
                            System.out.println("Введите день недели от 1 до 7");
                            d = sin.nextInt();
                            System.out.println("Введите время начала разговора");
                            t = sin.nextInt();
                            System.out.println("Введите продолжительность разговоров минутах");
                            dt = sin.nextInt();
                            System.out.println("Введите стоимость разговора за минуту");
                            s = sin.nextInt();
                            sm = 0.0;
                            minutes = t * 60;
                            if (minutes == 1440) {
                                d = d + 1;
                                minutes = 0;
                            }
                            for (int i = 0; i < dt; i++) {
                                minutes = minutes + 1;
                                if (minutes == 1440) {
                                    d = d + 1;
                                    minutes = 0;
                                }
                                if (d > 7) {
                                    d = 1;
                                }
                                if ((d == 6) || (d == 7)) {
                                    if ((minutes >= 1320) || (minutes < 480)) {
                                        sm = sm + (s * 0.8 * 0.9);
                                    } else {
                                        sm = sm + (s * 0.9);
                                    }
                                }
                                else if ((d==1)||(d==2)||(d==3)||(d==4)||(d==5)) {
                                    if ((minutes >= 1320) || (minutes < 480)) {
                                        sm = sm + (s * 0.8);
                                    } else {
                                        sm = sm + s;
                                    }

                                }
                            }
                            System.out.println("стоймость переговоров равна " + sm + " рублей");
                            System.out.println(" ");
                            System.out.println("перепроверим задание?");
                            System.out.println("1-да 2-нет");
                            c = sin.nextInt();
                        }
                    }
                    else if (b == 3) {
                        while (c == 1) {
                            System.out.println("Введите число A");
                            int A = sin.nextInt();
                            System.out.println("Введите число B");
                            int B = sin.nextInt();
                            System.out.println("Введите число C");
                            int C = sin.nextInt();
                            if (A % 2 == 0 || B % 2 == 0) {
                                System.out.println("Одно из чисел четное");
                            }
                            else {
                                System.out.println("числа не удовлетворяют первое условие");
                            }
                            if (A % 3 == 0 && B % 3 == 0 && C % 3 == 0) {
                                System.out.println("Числа кратные трём");
                            }
                            else {
                                System.out.println("числа не удовлетворяют второе условие");
                            }
                            System.out.println("перепроверим задание?");
                            System.out.println("1-да 2-нет");
                            c = sin.nextInt();
                        }
                    }
                    else if (b == 4) {
                        a = 1;
                    }
                }
            }
        }

