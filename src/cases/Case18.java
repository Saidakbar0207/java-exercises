package cases;

import java.util.Scanner;

public class Case18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(100<=n<=999) :");
        int n = sc.nextInt();
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        switch (a) {
            case 1 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred");
                            case 1 -> System.out.println("one hundred and one");
                            case 2 -> System.out.println("one hundred and two");
                            case 3 -> System.out.println("one hundred and three");
                            case 4 -> System.out.println("one hundred and four");
                            case 5 -> System.out.println("one hundred and five");
                            case 6 -> System.out.println("one hundred and six");
                            case 7 -> System.out.println("one hundred and seven");
                            case 8 -> System.out.println("one hundred and eight");
                            case 9 -> System.out.println("one hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundredand ten");
                            case 1 -> System.out.println("one hundred and eleven");
                            case 2 -> System.out.println("one hundred and twelve ");
                            case 3 -> System.out.println("one hundred and thirteen");
                            case 4 -> System.out.println("one hundred and fourteen");
                            case 5 -> System.out.println("one hundred and fifteen");
                            case 6 -> System.out.println("one hundred and sixteen");
                            case 7 -> System.out.println("one hundred and seventeen");
                            case 8 -> System.out.println("one hundred and eighteen");
                            case 9 -> System.out.println("one hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred");
                            case 1 -> System.out.println("one hundred and twenty-one");
                            case 2 -> System.out.println("one hundred and twenty-two");
                            case 3 -> System.out.println("one hundred and twenty-three");
                            case 4 -> System.out.println("one hundred and twenty-four");
                            case 5 -> System.out.println("one hundred and twenty-five");
                            case 6 -> System.out.println("one hundred and twenty-six");
                            case 7 -> System.out.println("one hundred and twenty-seven");
                            case 8 -> System.out.println("one hundred and twenty-eight");
                            case 9 -> System.out.println("one hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and thirty");
                            case 1 -> System.out.println("one hundred and thirty-one");
                            case 2 -> System.out.println("one hundred and thirty-two");
                            case 3 -> System.out.println("one hundred and thirty-three");
                            case 4 -> System.out.println("one hundred and thirty-four");
                            case 5 -> System.out.println("one hundred and thirty-five");
                            case 6 -> System.out.println("one hundred and thirty-six");
                            case 7 -> System.out.println("one hundred and thirty-seven");
                            case 8 -> System.out.println("one hundred and thirty-eight");
                            case 9 -> System.out.println("one hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and forty");
                            case 1 -> System.out.println("one hundred and forty-one");
                            case 2 -> System.out.println("one hundred and forty-two");
                            case 3 -> System.out.println("one hundred and forty-three");
                            case 4 -> System.out.println("one hundred and forty-four");
                            case 5 -> System.out.println("one hundred and forty-five");
                            case 6 -> System.out.println("one hundred and forty-six");
                            case 7 -> System.out.println("one hundred and forty-seven");
                            case 8 -> System.out.println("one hundred and forty-eight");
                            case 9 -> System.out.println("one hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and fifty");
                            case 1 -> System.out.println("one hundred and fifty-one");
                            case 2 -> System.out.println("one hundred and fifty-two");
                            case 3 -> System.out.println("one hundred and fifty-three");
                            case 4 -> System.out.println("one hundred and fifty-four");
                            case 5 -> System.out.println("one hundred and fifty-five");
                            case 6 -> System.out.println("one hundred and fifty-six");
                            case 7 -> System.out.println("one hundred and fifty-seven");
                            case 8 -> System.out.println("one hundred and fifty-eight");
                            case 9 -> System.out.println("one hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and sixty");
                            case 1 -> System.out.println("one hundred and sixty-one");
                            case 2 -> System.out.println("one hundred and sixty-two");
                            case 3 -> System.out.println("one hundred and sixty-three");
                            case 4 -> System.out.println("one hundred and sixty-four");
                            case 5 -> System.out.println("one hundred and sixty-five");
                            case 6 -> System.out.println("one hundred and sixty-six");
                            case 7 -> System.out.println("one hundred and sixty-seven");
                            case 8 -> System.out.println("one hundred and sixty-eight");
                            case 9 -> System.out.println("one hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and seventy");
                            case 1 -> System.out.println("one hundred and seventy-one");
                            case 2 -> System.out.println("one hundred and seventy-two");
                            case 3 -> System.out.println("one hundred and seventy-three");
                            case 4 -> System.out.println("one hundred and seventy-four");
                            case 5 -> System.out.println("one hundred and seventy-five");
                            case 6 -> System.out.println("one hundred and seventy-six");
                            case 7 -> System.out.println("one hundred and seventy-seven");
                            case 8 -> System.out.println("one hundred and seventy-eight");
                            case 9 -> System.out.println("one hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and eighty");
                            case 1 -> System.out.println("one hundred and eighty-one");
                            case 2 -> System.out.println("one hundred and eighty-two");
                            case 3 -> System.out.println("one hundred and eighty-three");
                            case 4 -> System.out.println("one hundred and eighty-four");
                            case 5 -> System.out.println("one hundred and eighty-five");
                            case 6 -> System.out.println("one hundred and eighty-six");
                            case 7 -> System.out.println("one hundred and eighty-seven");
                            case 8 -> System.out.println("one hundred and eighty-eight");
                            case 9 -> System.out.println("one hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("one hundred and ninety");
                            case 1 -> System.out.println("one hundred and ninety-one");
                            case 2 -> System.out.println("one hundred and ninety-two");
                            case 3 -> System.out.println("one hundred and ninety-three");
                            case 4 -> System.out.println("one hundred and ninety-four");
                            case 5 -> System.out.println("one hundred and ninety-five");
                            case 6 -> System.out.println("one hundred and ninety-six");
                            case 7 -> System.out.println("one hundred and ninety-seven");
                            case 8 -> System.out.println("one hundred and ninety-eight");
                            case 9 -> System.out.println("one hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 2 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred");
                            case 1 -> System.out.println("two hundred and one");
                            case 2 -> System.out.println("two hundred and two");
                            case 3 -> System.out.println("two hundred and three");
                            case 4 -> System.out.println("two hundred and four");
                            case 5 -> System.out.println("two hundred and five");
                            case 6 -> System.out.println("two hundred and six");
                            case 7 -> System.out.println("two hundred and seven");
                            case 8 -> System.out.println("two hundred and eight");
                            case 9 -> System.out.println("two hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundredand ten");
                            case 1 -> System.out.println("two hundred and eleven");
                            case 2 -> System.out.println("two hundred and twelve ");
                            case 3 -> System.out.println("two hundred and thirteen");
                            case 4 -> System.out.println("two hundred and fourteen");
                            case 5 -> System.out.println("two hundred and fifteen");
                            case 6 -> System.out.println("two hundred and sixteen");
                            case 7 -> System.out.println("two hundred and seventeen");
                            case 8 -> System.out.println("two hundred and eighteen");
                            case 9 -> System.out.println("two hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred");
                            case 1 -> System.out.println("two hundred and twenty-one");
                            case 2 -> System.out.println("two hundred and twenty-two");
                            case 3 -> System.out.println("two hundred and twenty-three");
                            case 4 -> System.out.println("two hundred and twenty-four");
                            case 5 -> System.out.println("two hundred and twenty-five");
                            case 6 -> System.out.println("two hundred and twenty-six");
                            case 7 -> System.out.println("two hundred and twenty-seven");
                            case 8 -> System.out.println("two hundred and twenty-eight");
                            case 9 -> System.out.println("two hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and thirty");
                            case 1 -> System.out.println("two hundred and thirty-one");
                            case 2 -> System.out.println("two hundred and thirty-two");
                            case 3 -> System.out.println("two hundred and thirty-three");
                            case 4 -> System.out.println("two hundred and thirty-four");
                            case 5 -> System.out.println("two hundred and thirty-five");
                            case 6 -> System.out.println("two hundred and thirty-six");
                            case 7 -> System.out.println("two hundred and thirty-seven");
                            case 8 -> System.out.println("two hundred and thirty-eight");
                            case 9 -> System.out.println("two hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and forty");
                            case 1 -> System.out.println("two hundred and forty-one");
                            case 2 -> System.out.println("two hundred and forty-two");
                            case 3 -> System.out.println("two hundred and forty-three");
                            case 4 -> System.out.println("two hundred and forty-four");
                            case 5 -> System.out.println("two hundred and forty-five");
                            case 6 -> System.out.println("two hundred and forty-six");
                            case 7 -> System.out.println("two hundred and forty-seven");
                            case 8 -> System.out.println("two hundred and forty-eight");
                            case 9 -> System.out.println("two hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and fifty");
                            case 1 -> System.out.println("two hundred and fifty-one");
                            case 2 -> System.out.println("two hundred and fifty-two");
                            case 3 -> System.out.println("two hundred and fifty-three");
                            case 4 -> System.out.println("two hundred and fifty-four");
                            case 5 -> System.out.println("two hundred and fifty-five");
                            case 6 -> System.out.println("two hundred and fifty-six");
                            case 7 -> System.out.println("two hundred and fifty-seven");
                            case 8 -> System.out.println("two hundred and fifty-eight");
                            case 9 -> System.out.println("two hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and sixty");
                            case 1 -> System.out.println("two hundred and sixty-one");
                            case 2 -> System.out.println("two hundred and sixty-two");
                            case 3 -> System.out.println("two hundred and sixty-three");
                            case 4 -> System.out.println("two hundred and sixty-four");
                            case 5 -> System.out.println("two hundred and sixty-five");
                            case 6 -> System.out.println("two hundred and sixty-six");
                            case 7 -> System.out.println("two hundred and sixty-seven");
                            case 8 -> System.out.println("two hundred and sixty-eight");
                            case 9 -> System.out.println("two hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and seventy");
                            case 1 -> System.out.println("two hundred and seventy-one");
                            case 2 -> System.out.println("two hundred and seventy-two");
                            case 3 -> System.out.println("two hundred and seventy-three");
                            case 4 -> System.out.println("two hundred and seventy-four");
                            case 5 -> System.out.println("two hundred and seventy-five");
                            case 6 -> System.out.println("two hundred and seventy-six");
                            case 7 -> System.out.println("two hundred and seventy-seven");
                            case 8 -> System.out.println("two hundred and seventy-eight");
                            case 9 -> System.out.println("two hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and eighty");
                            case 1 -> System.out.println("two hundred and eighty-one");
                            case 2 -> System.out.println("two hundred and eighty-two");
                            case 3 -> System.out.println("two hundred and eighty-three");
                            case 4 -> System.out.println("two hundred and eighty-four");
                            case 5 -> System.out.println("two hundred and eighty-five");
                            case 6 -> System.out.println("two hundred and eighty-six");
                            case 7 -> System.out.println("two hundred and eighty-seven");
                            case 8 -> System.out.println("two hundred and eighty-eight");
                            case 9 -> System.out.println("two hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("two hundred and ninety");
                            case 1 -> System.out.println("two hundred and ninety-one");
                            case 2 -> System.out.println("two hundred and ninety-two");
                            case 3 -> System.out.println("two hundred and ninety-three");
                            case 4 -> System.out.println("two hundred and ninety-four");
                            case 5 -> System.out.println("two hundred and ninety-five");
                            case 6 -> System.out.println("two hundred and ninety-six");
                            case 7 -> System.out.println("two hundred and ninety-seven");
                            case 8 -> System.out.println("two hundred and ninety-eight");
                            case 9 -> System.out.println("two hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 3 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred");
                            case 1 -> System.out.println("three hundred and one");
                            case 2 -> System.out.println("three hundred and two");
                            case 3 -> System.out.println("three hundred and three");
                            case 4 -> System.out.println("three hundred and four");
                            case 5 -> System.out.println("three hundred and five");
                            case 6 -> System.out.println("three hundred and six");
                            case 7 -> System.out.println("three hundred and seven");
                            case 8 -> System.out.println("three hundred and eight");
                            case 9 -> System.out.println("three hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundredand ten");
                            case 1 -> System.out.println("three hundred and eleven");
                            case 2 -> System.out.println("three hundred and twelve ");
                            case 3 -> System.out.println("three hundred and thirteen");
                            case 4 -> System.out.println("three hundred and fourteen");
                            case 5 -> System.out.println("three hundred and fifteen");
                            case 6 -> System.out.println("three hundred and sixteen");
                            case 7 -> System.out.println("three hundred and seventeen");
                            case 8 -> System.out.println("three hundred and eighteen");
                            case 9 -> System.out.println("three hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred");
                            case 1 -> System.out.println("three hundred and twenty-one");
                            case 2 -> System.out.println("three hundred and twenty-two");
                            case 3 -> System.out.println("three hundred and twenty-three");
                            case 4 -> System.out.println("three hundred and twenty-four");
                            case 5 -> System.out.println("three hundred and twenty-five");
                            case 6 -> System.out.println("three hundred and twenty-six");
                            case 7 -> System.out.println("three hundred and twenty-seven");
                            case 8 -> System.out.println("three hundred and twenty-eight");
                            case 9 -> System.out.println("three hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and thirty");
                            case 1 -> System.out.println("three hundred and thirty-one");
                            case 2 -> System.out.println("three hundred and thirty-two");
                            case 3 -> System.out.println("three hundred and thirty-three");
                            case 4 -> System.out.println("three hundred and thirty-four");
                            case 5 -> System.out.println("three hundred and thirty-five");
                            case 6 -> System.out.println("three hundred and thirty-six");
                            case 7 -> System.out.println("three hundred and thirty-seven");
                            case 8 -> System.out.println("three hundred and thirty-eight");
                            case 9 -> System.out.println("three hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and forty");
                            case 1 -> System.out.println("three hundred and forty-one");
                            case 2 -> System.out.println("three hundred and forty-two");
                            case 3 -> System.out.println("three hundred and forty-three");
                            case 4 -> System.out.println("three hundred and forty-four");
                            case 5 -> System.out.println("three hundred and forty-five");
                            case 6 -> System.out.println("three hundred and forty-six");
                            case 7 -> System.out.println("three hundred and forty-seven");
                            case 8 -> System.out.println("three hundred and forty-eight");
                            case 9 -> System.out.println("three hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and fifty");
                            case 1 -> System.out.println("three hundred and fifty-one");
                            case 2 -> System.out.println("three hundred and fifty-two");
                            case 3 -> System.out.println("three hundred and fifty-three");
                            case 4 -> System.out.println("three hundred and fifty-four");
                            case 5 -> System.out.println("three hundred and fifty-five");
                            case 6 -> System.out.println("three hundred and fifty-six");
                            case 7 -> System.out.println("three hundred and fifty-seven");
                            case 8 -> System.out.println("three hundred and fifty-eight");
                            case 9 -> System.out.println("three hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and sixty");
                            case 1 -> System.out.println("three hundred and sixty-one");
                            case 2 -> System.out.println("three hundred and sixty-two");
                            case 3 -> System.out.println("three hundred and sixty-three");
                            case 4 -> System.out.println("three hundred and sixty-four");
                            case 5 -> System.out.println("three hundred and sixty-five");
                            case 6 -> System.out.println("three hundred and sixty-six");
                            case 7 -> System.out.println("three hundred and sixty-seven");
                            case 8 -> System.out.println("three hundred and sixty-eight");
                            case 9 -> System.out.println("three hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and seventy");
                            case 1 -> System.out.println("three hundred and seventy-one");
                            case 2 -> System.out.println("three hundred and seventy-two");
                            case 3 -> System.out.println("three hundred and seventy-three");
                            case 4 -> System.out.println("three hundred and seventy-four");
                            case 5 -> System.out.println("three hundred and seventy-five");
                            case 6 -> System.out.println("three hundred and seventy-six");
                            case 7 -> System.out.println("three hundred and seventy-seven");
                            case 8 -> System.out.println("three hundred and seventy-eight");
                            case 9 -> System.out.println("three hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and eighty");
                            case 1 -> System.out.println("three hundred and eighty-one");
                            case 2 -> System.out.println("three hundred and eighty-two");
                            case 3 -> System.out.println("three hundred and eighty-three");
                            case 4 -> System.out.println("three hundred and eighty-four");
                            case 5 -> System.out.println("three hundred and eighty-five");
                            case 6 -> System.out.println("three hundred and eighty-six");
                            case 7 -> System.out.println("three hundred and eighty-seven");
                            case 8 -> System.out.println("three hundred and eighty-eight");
                            case 9 -> System.out.println("three hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("three hundred and ninety");
                            case 1 -> System.out.println("three hundred and ninety-one");
                            case 2 -> System.out.println("three hundred and ninety-two");
                            case 3 -> System.out.println("three hundred and ninety-three");
                            case 4 -> System.out.println("three hundred and ninety-four");
                            case 5 -> System.out.println("three hundred and ninety-five");
                            case 6 -> System.out.println("three hundred and ninety-six");
                            case 7 -> System.out.println("three hundred and ninety-seven");
                            case 8 -> System.out.println("three hundred and ninety-eight");
                            case 9 -> System.out.println("three hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 4 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred");
                            case 1 -> System.out.println("four hundred and one");
                            case 2 -> System.out.println("four hundred and two");
                            case 3 -> System.out.println("four hundred and three");
                            case 4 -> System.out.println("four hundred and four");
                            case 5 -> System.out.println("four hundred and five");
                            case 6 -> System.out.println("four hundred and six");
                            case 7 -> System.out.println("four hundred and seven");
                            case 8 -> System.out.println("four hundred and eight");
                            case 9 -> System.out.println("four hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundredand ten");
                            case 1 -> System.out.println("four hundred and eleven");
                            case 2 -> System.out.println("four hundred and twelve ");
                            case 3 -> System.out.println("four hundred and thirteen");
                            case 4 -> System.out.println("four hundred and fourteen");
                            case 5 -> System.out.println("four hundred and fifteen");
                            case 6 -> System.out.println("four hundred and sixteen");
                            case 7 -> System.out.println("four hundred and seventeen");
                            case 8 -> System.out.println("four hundred and eighteen");
                            case 9 -> System.out.println("four hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred");
                            case 1 -> System.out.println("four hundred and twenty-one");
                            case 2 -> System.out.println("four hundred and twenty-two");
                            case 3 -> System.out.println("four hundred and twenty-three");
                            case 4 -> System.out.println("four hundred and twenty-four");
                            case 5 -> System.out.println("four hundred and twenty-five");
                            case 6 -> System.out.println("four hundred and twenty-six");
                            case 7 -> System.out.println("four hundred and twenty-seven");
                            case 8 -> System.out.println("four hundred and twenty-eight");
                            case 9 -> System.out.println("four hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and thirty");
                            case 1 -> System.out.println("four hundred and thirty-one");
                            case 2 -> System.out.println("four hundred and thirty-two");
                            case 3 -> System.out.println("four hundred and thirty-three");
                            case 4 -> System.out.println("four hundred and thirty-four");
                            case 5 -> System.out.println("four hundred and thirty-five");
                            case 6 -> System.out.println("four hundred and thirty-six");
                            case 7 -> System.out.println("four hundred and thirty-seven");
                            case 8 -> System.out.println("four hundred and thirty-eight");
                            case 9 -> System.out.println("four hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and forty");
                            case 1 -> System.out.println("four hundred and forty-one");
                            case 2 -> System.out.println("four hundred and forty-two");
                            case 3 -> System.out.println("four hundred and forty-three");
                            case 4 -> System.out.println("four hundred and forty-four");
                            case 5 -> System.out.println("four hundred and forty-five");
                            case 6 -> System.out.println("four hundred and forty-six");
                            case 7 -> System.out.println("four hundred and forty-seven");
                            case 8 -> System.out.println("four hundred and forty-eight");
                            case 9 -> System.out.println("four hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and fifty");
                            case 1 -> System.out.println("four hundred and fifty-one");
                            case 2 -> System.out.println("four hundred and fifty-two");
                            case 3 -> System.out.println("four hundred and fifty-three");
                            case 4 -> System.out.println("four hundred and fifty-four");
                            case 5 -> System.out.println("four hundred and fifty-five");
                            case 6 -> System.out.println("four hundred and fifty-six");
                            case 7 -> System.out.println("four hundred and fifty-seven");
                            case 8 -> System.out.println("four hundred and fifty-eight");
                            case 9 -> System.out.println("four hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and sixty");
                            case 1 -> System.out.println("four hundred and sixty-one");
                            case 2 -> System.out.println("four hundred and sixty-two");
                            case 3 -> System.out.println("four hundred and sixty-three");
                            case 4 -> System.out.println("four hundred and sixty-four");
                            case 5 -> System.out.println("four hundred and sixty-five");
                            case 6 -> System.out.println("four hundred and sixty-six");
                            case 7 -> System.out.println("four hundred and sixty-seven");
                            case 8 -> System.out.println("four hundred and sixty-eight");
                            case 9 -> System.out.println("four hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and seventy");
                            case 1 -> System.out.println("four hundred and seventy-one");
                            case 2 -> System.out.println("four hundred and seventy-two");
                            case 3 -> System.out.println("four hundred and seventy-three");
                            case 4 -> System.out.println("four hundred and seventy-four");
                            case 5 -> System.out.println("four hundred and seventy-five");
                            case 6 -> System.out.println("four hundred and seventy-six");
                            case 7 -> System.out.println("four hundred and seventy-seven");
                            case 8 -> System.out.println("four hundred and seventy-eight");
                            case 9 -> System.out.println("four hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and eighty");
                            case 1 -> System.out.println("four hundred and eighty-one");
                            case 2 -> System.out.println("four hundred and eighty-two");
                            case 3 -> System.out.println("four hundred and eighty-three");
                            case 4 -> System.out.println("four hundred and eighty-four");
                            case 5 -> System.out.println("four hundred and eighty-five");
                            case 6 -> System.out.println("four hundred and eighty-six");
                            case 7 -> System.out.println("four hundred and eighty-seven");
                            case 8 -> System.out.println("four hundred and eighty-eight");
                            case 9 -> System.out.println("four hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("four hundred and ninety");
                            case 1 -> System.out.println("four hundred and ninety-one");
                            case 2 -> System.out.println("four hundred and ninety-two");
                            case 3 -> System.out.println("four hundred and ninety-three");
                            case 4 -> System.out.println("four hundred and ninety-four");
                            case 5 -> System.out.println("four hundred and ninety-five");
                            case 6 -> System.out.println("four hundred and ninety-six");
                            case 7 -> System.out.println("four hundred and ninety-seven");
                            case 8 -> System.out.println("four hundred and ninety-eight");
                            case 9 -> System.out.println("four hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 5 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred");
                            case 1 -> System.out.println("five hundred and one");
                            case 2 -> System.out.println("five hundred and two");
                            case 3 -> System.out.println("five hundred and three");
                            case 4 -> System.out.println("five hundred and four");
                            case 5 -> System.out.println("five hundred and five");
                            case 6 -> System.out.println("five hundred and six");
                            case 7 -> System.out.println("five hundred and seven");
                            case 8 -> System.out.println("five hundred and eight");
                            case 9 -> System.out.println("five hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundredand ten");
                            case 1 -> System.out.println("five hundred and eleven");
                            case 2 -> System.out.println("five hundred and twelve ");
                            case 3 -> System.out.println("five hundred and thirteen");
                            case 4 -> System.out.println("five hundred and fourteen");
                            case 5 -> System.out.println("five hundred and fifteen");
                            case 6 -> System.out.println("five hundred and sixteen");
                            case 7 -> System.out.println("five hundred and seventeen");
                            case 8 -> System.out.println("five hundred and eighteen");
                            case 9 -> System.out.println("five hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred");
                            case 1 -> System.out.println("five hundred and twenty-one");
                            case 2 -> System.out.println("five hundred and twenty-two");
                            case 3 -> System.out.println("five hundred and twenty-three");
                            case 4 -> System.out.println("five hundred and twenty-four");
                            case 5 -> System.out.println("five hundred and twenty-five");
                            case 6 -> System.out.println("five hundred and twenty-six");
                            case 7 -> System.out.println("five hundred and twenty-seven");
                            case 8 -> System.out.println("five hundred and twenty-eight");
                            case 9 -> System.out.println("five hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and thirty");
                            case 1 -> System.out.println("five hundred and thirty-one");
                            case 2 -> System.out.println("five hundred and thirty-two");
                            case 3 -> System.out.println("five hundred and thirty-three");
                            case 4 -> System.out.println("five hundred and thirty-four");
                            case 5 -> System.out.println("five hundred and thirty-five");
                            case 6 -> System.out.println("five hundred and thirty-six");
                            case 7 -> System.out.println("five hundred and thirty-seven");
                            case 8 -> System.out.println("five hundred and thirty-eight");
                            case 9 -> System.out.println("five hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and forty");
                            case 1 -> System.out.println("five hundred and forty-one");
                            case 2 -> System.out.println("five hundred and forty-two");
                            case 3 -> System.out.println("five hundred and forty-three");
                            case 4 -> System.out.println("five hundred and forty-four");
                            case 5 -> System.out.println("five hundred and forty-five");
                            case 6 -> System.out.println("five hundred and forty-six");
                            case 7 -> System.out.println("five hundred and forty-seven");
                            case 8 -> System.out.println("five hundred and forty-eight");
                            case 9 -> System.out.println("five hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and fifty");
                            case 1 -> System.out.println("five hundred and fifty-one");
                            case 2 -> System.out.println("five hundred and fifty-two");
                            case 3 -> System.out.println("five hundred and fifty-three");
                            case 4 -> System.out.println("five hundred and fifty-four");
                            case 5 -> System.out.println("five hundred and fifty-five");
                            case 6 -> System.out.println("five hundred and fifty-six");
                            case 7 -> System.out.println("five hundred and fifty-seven");
                            case 8 -> System.out.println("five hundred and fifty-eight");
                            case 9 -> System.out.println("five hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and sixty");
                            case 1 -> System.out.println("five hundred and sixty-one");
                            case 2 -> System.out.println("five hundred and sixty-two");
                            case 3 -> System.out.println("five hundred and sixty-three");
                            case 4 -> System.out.println("five hundred and sixty-four");
                            case 5 -> System.out.println("five hundred and sixty-five");
                            case 6 -> System.out.println("five hundred and sixty-six");
                            case 7 -> System.out.println("five hundred and sixty-seven");
                            case 8 -> System.out.println("five hundred and sixty-eight");
                            case 9 -> System.out.println("five hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and seventy");
                            case 1 -> System.out.println("five hundred and seventy-one");
                            case 2 -> System.out.println("five hundred and seventy-two");
                            case 3 -> System.out.println("five hundred and seventy-three");
                            case 4 -> System.out.println("five hundred and seventy-four");
                            case 5 -> System.out.println("five hundred and seventy-five");
                            case 6 -> System.out.println("five hundred and seventy-six");
                            case 7 -> System.out.println("five hundred and seventy-seven");
                            case 8 -> System.out.println("five hundred and seventy-eight");
                            case 9 -> System.out.println("five hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and eighty");
                            case 1 -> System.out.println("five hundred and eighty-one");
                            case 2 -> System.out.println("five hundred and eighty-two");
                            case 3 -> System.out.println("five hundred and eighty-three");
                            case 4 -> System.out.println("five hundred and eighty-four");
                            case 5 -> System.out.println("five hundred and eighty-five");
                            case 6 -> System.out.println("five hundred and eighty-six");
                            case 7 -> System.out.println("five hundred and eighty-seven");
                            case 8 -> System.out.println("five hundred and eighty-eight");
                            case 9 -> System.out.println("five hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("five hundred and ninety");
                            case 1 -> System.out.println("five hundred and ninety-one");
                            case 2 -> System.out.println("five hundred and ninety-two");
                            case 3 -> System.out.println("five hundred and ninety-three");
                            case 4 -> System.out.println("five hundred and ninety-four");
                            case 5 -> System.out.println("five hundred and ninety-five");
                            case 6 -> System.out.println("five hundred and ninety-six");
                            case 7 -> System.out.println("five hundred and ninety-seven");
                            case 8 -> System.out.println("five hundred and ninety-eight");
                            case 9 -> System.out.println("five hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 6 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred");
                            case 1 -> System.out.println("six hundred and one");
                            case 2 -> System.out.println("six hundred and two");
                            case 3 -> System.out.println("six hundred and three");
                            case 4 -> System.out.println("six hundred and four");
                            case 5 -> System.out.println("six hundred and five");
                            case 6 -> System.out.println("six hundred and six");
                            case 7 -> System.out.println("six hundred and seven");
                            case 8 -> System.out.println("six hundred and eight");
                            case 9 -> System.out.println("six hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundredand ten");
                            case 1 -> System.out.println("six hundred and eleven");
                            case 2 -> System.out.println("six hundred and twelve ");
                            case 3 -> System.out.println("six hundred and thirteen");
                            case 4 -> System.out.println("six hundred and fourteen");
                            case 5 -> System.out.println("six hundred and fifteen");
                            case 6 -> System.out.println("six hundred and sixteen");
                            case 7 -> System.out.println("six hundred and seventeen");
                            case 8 -> System.out.println("six hundred and eighteen");
                            case 9 -> System.out.println("six hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred");
                            case 1 -> System.out.println("six hundred and twenty-one");
                            case 2 -> System.out.println("six hundred and twenty-two");
                            case 3 -> System.out.println("six hundred and twenty-three");
                            case 4 -> System.out.println("six hundred and twenty-four");
                            case 5 -> System.out.println("six hundred and twenty-five");
                            case 6 -> System.out.println("six hundred and twenty-six");
                            case 7 -> System.out.println("six hundred and twenty-seven");
                            case 8 -> System.out.println("six hundred and twenty-eight");
                            case 9 -> System.out.println("six hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and thirty");
                            case 1 -> System.out.println("six hundred and thirty-one");
                            case 2 -> System.out.println("six hundred and thirty-two");
                            case 3 -> System.out.println("six hundred and thirty-three");
                            case 4 -> System.out.println("six hundred and thirty-four");
                            case 5 -> System.out.println("six hundred and thirty-five");
                            case 6 -> System.out.println("six hundred and thirty-six");
                            case 7 -> System.out.println("six hundred and thirty-seven");
                            case 8 -> System.out.println("six hundred and thirty-eight");
                            case 9 -> System.out.println("six hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and forty");
                            case 1 -> System.out.println("six hundred and forty-one");
                            case 2 -> System.out.println("six hundred and forty-two");
                            case 3 -> System.out.println("six hundred and forty-three");
                            case 4 -> System.out.println("six hundred and forty-four");
                            case 5 -> System.out.println("six hundred and forty-five");
                            case 6 -> System.out.println("six hundred and forty-six");
                            case 7 -> System.out.println("six hundred and forty-seven");
                            case 8 -> System.out.println("six hundred and forty-eight");
                            case 9 -> System.out.println("six hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and fifty");
                            case 1 -> System.out.println("six hundred and fifty-one");
                            case 2 -> System.out.println("six hundred and fifty-two");
                            case 3 -> System.out.println("six hundred and fifty-three");
                            case 4 -> System.out.println("six hundred and fifty-four");
                            case 5 -> System.out.println("six hundred and fifty-five");
                            case 6 -> System.out.println("six hundred and fifty-six");
                            case 7 -> System.out.println("six hundred and fifty-seven");
                            case 8 -> System.out.println("six hundred and fifty-eight");
                            case 9 -> System.out.println("six hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and sixty");
                            case 1 -> System.out.println("six hundred and sixty-one");
                            case 2 -> System.out.println("six hundred and sixty-two");
                            case 3 -> System.out.println("six hundred and sixty-three");
                            case 4 -> System.out.println("six hundred and sixty-four");
                            case 5 -> System.out.println("six hundred and sixty-five");
                            case 6 -> System.out.println("six hundred and sixty-six");
                            case 7 -> System.out.println("six hundred and sixty-seven");
                            case 8 -> System.out.println("six hundred and sixty-eight");
                            case 9 -> System.out.println("six hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and seventy");
                            case 1 -> System.out.println("six hundred and seventy-one");
                            case 2 -> System.out.println("six hundred and seventy-two");
                            case 3 -> System.out.println("six hundred and seventy-three");
                            case 4 -> System.out.println("six hundred and seventy-four");
                            case 5 -> System.out.println("six hundred and seventy-five");
                            case 6 -> System.out.println("six hundred and seventy-six");
                            case 7 -> System.out.println("six hundred and seventy-seven");
                            case 8 -> System.out.println("six hundred and seventy-eight");
                            case 9 -> System.out.println("six hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and eighty");
                            case 1 -> System.out.println("six hundred and eighty-one");
                            case 2 -> System.out.println("six hundred and eighty-two");
                            case 3 -> System.out.println("six hundred and eighty-three");
                            case 4 -> System.out.println("six hundred and eighty-four");
                            case 5 -> System.out.println("six hundred and eighty-five");
                            case 6 -> System.out.println("six hundred and eighty-six");
                            case 7 -> System.out.println("six hundred and eighty-seven");
                            case 8 -> System.out.println("six hundred and eighty-eight");
                            case 9 -> System.out.println("six hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("six hundred and ninety");
                            case 1 -> System.out.println("six hundred and ninety-one");
                            case 2 -> System.out.println("six hundred and ninety-two");
                            case 3 -> System.out.println("six hundred and ninety-three");
                            case 4 -> System.out.println("six hundred and ninety-four");
                            case 5 -> System.out.println("six hundred and ninety-five");
                            case 6 -> System.out.println("six hundred and ninety-six");
                            case 7 -> System.out.println("six hundred and ninety-seven");
                            case 8 -> System.out.println("six hundred and ninety-eight");
                            case 9 -> System.out.println("six hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 7 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred");
                            case 1 -> System.out.println("seven hundred and one");
                            case 2 -> System.out.println("seven hundred and two");
                            case 3 -> System.out.println("seven hundred and three");
                            case 4 -> System.out.println("seven hundred and four");
                            case 5 -> System.out.println("seven hundred and five");
                            case 6 -> System.out.println("seven hundred and six");
                            case 7 -> System.out.println("seven hundred and seven");
                            case 8 -> System.out.println("seven hundred and eight");
                            case 9 -> System.out.println("seven hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundredand ten");
                            case 1 -> System.out.println("seven hundred and eleven");
                            case 2 -> System.out.println("seven hundred and twelve ");
                            case 3 -> System.out.println("seven hundred and thirteen");
                            case 4 -> System.out.println("seven hundred and fourteen");
                            case 5 -> System.out.println("seven hundred and fifteen");
                            case 6 -> System.out.println("seven hundred and sixteen");
                            case 7 -> System.out.println("seven hundred and seventeen");
                            case 8 -> System.out.println("seven hundred and eighteen");
                            case 9 -> System.out.println("seven hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred");
                            case 1 -> System.out.println("seven hundred and twenty-one");
                            case 2 -> System.out.println("seven hundred and twenty-two");
                            case 3 -> System.out.println("seven hundred and twenty-three");
                            case 4 -> System.out.println("seven hundred and twenty-four");
                            case 5 -> System.out.println("seven hundred and twenty-five");
                            case 6 -> System.out.println("seven hundred and twenty-six");
                            case 7 -> System.out.println("seven hundred and twenty-seven");
                            case 8 -> System.out.println("seven hundred and twenty-eight");
                            case 9 -> System.out.println("seven hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and thirty");
                            case 1 -> System.out.println("seven hundred and thirty-one");
                            case 2 -> System.out.println("seven hundred and thirty-two");
                            case 3 -> System.out.println("seven hundred and thirty-three");
                            case 4 -> System.out.println("seven hundred and thirty-four");
                            case 5 -> System.out.println("seven hundred and thirty-five");
                            case 6 -> System.out.println("seven hundred and thirty-six");
                            case 7 -> System.out.println("seven hundred and thirty-seven");
                            case 8 -> System.out.println("seven hundred and thirty-eight");
                            case 9 -> System.out.println("seven hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and forty");
                            case 1 -> System.out.println("seven hundred and forty-one");
                            case 2 -> System.out.println("seven hundred and forty-two");
                            case 3 -> System.out.println("seven hundred and forty-three");
                            case 4 -> System.out.println("seven hundred and forty-four");
                            case 5 -> System.out.println("seven hundred and forty-five");
                            case 6 -> System.out.println("seven hundred and forty-six");
                            case 7 -> System.out.println("seven hundred and forty-seven");
                            case 8 -> System.out.println("seven hundred and forty-eight");
                            case 9 -> System.out.println("seven hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and fifty");
                            case 1 -> System.out.println("seven hundred and fifty-one");
                            case 2 -> System.out.println("seven hundred and fifty-two");
                            case 3 -> System.out.println("seven hundred and fifty-three");
                            case 4 -> System.out.println("seven hundred and fifty-four");
                            case 5 -> System.out.println("seven hundred and fifty-five");
                            case 6 -> System.out.println("seven hundred and fifty-six");
                            case 7 -> System.out.println("seven hundred and fifty-seven");
                            case 8 -> System.out.println("seven hundred and fifty-eight");
                            case 9 -> System.out.println("seven hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and sixty");
                            case 1 -> System.out.println("seven hundred and sixty-one");
                            case 2 -> System.out.println("seven hundred and sixty-two");
                            case 3 -> System.out.println("seven hundred and sixty-three");
                            case 4 -> System.out.println("seven hundred and sixty-four");
                            case 5 -> System.out.println("seven hundred and sixty-five");
                            case 6 -> System.out.println("seven hundred and sixty-six");
                            case 7 -> System.out.println("seven hundred and sixty-seven");
                            case 8 -> System.out.println("seven hundred and sixty-eight");
                            case 9 -> System.out.println("seven hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and seventy");
                            case 1 -> System.out.println("seven hundred and seventy-one");
                            case 2 -> System.out.println("seven hundred and seventy-two");
                            case 3 -> System.out.println("seven hundred and seventy-three");
                            case 4 -> System.out.println("seven hundred and seventy-four");
                            case 5 -> System.out.println("seven hundred and seventy-five");
                            case 6 -> System.out.println("seven hundred and seventy-six");
                            case 7 -> System.out.println("seven hundred and seventy-seven");
                            case 8 -> System.out.println("seven hundred and seventy-eight");
                            case 9 -> System.out.println("seven hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and eighty");
                            case 1 -> System.out.println("seven hundred and eighty-one");
                            case 2 -> System.out.println("seven hundred and eighty-two");
                            case 3 -> System.out.println("seven hundred and eighty-three");
                            case 4 -> System.out.println("seven hundred and eighty-four");
                            case 5 -> System.out.println("seven hundred and eighty-five");
                            case 6 -> System.out.println("seven hundred and eighty-six");
                            case 7 -> System.out.println("seven hundred and eighty-seven");
                            case 8 -> System.out.println("seven hundred and eighty-eight");
                            case 9 -> System.out.println("seven hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("seven hundred and ninety");
                            case 1 -> System.out.println("seven hundred and ninety-one");
                            case 2 -> System.out.println("seven hundred and ninety-two");
                            case 3 -> System.out.println("seven hundred and ninety-three");
                            case 4 -> System.out.println("seven hundred and ninety-four");
                            case 5 -> System.out.println("seven hundred and ninety-five");
                            case 6 -> System.out.println("seven hundred and ninety-six");
                            case 7 -> System.out.println("seven hundred and ninety-seven");
                            case 8 -> System.out.println("seven hundred and ninety-eight");
                            case 9 -> System.out.println("seven hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 8 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred");
                            case 1 -> System.out.println("eight hundred and one");
                            case 2 -> System.out.println("eight hundred and two");
                            case 3 -> System.out.println("eight hundred and three");
                            case 4 -> System.out.println("eight hundred and four");
                            case 5 -> System.out.println("eight hundred and five");
                            case 6 -> System.out.println("eight hundred and six");
                            case 7 -> System.out.println("eight hundred and seven");
                            case 8 -> System.out.println("eight hundred and eight");
                            case 9 -> System.out.println("eight hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundredand ten");
                            case 1 -> System.out.println("eight hundred and eleven");
                            case 2 -> System.out.println("eight hundred and twelve ");
                            case 3 -> System.out.println("eight hundred and thirteen");
                            case 4 -> System.out.println("eight hundred and fourteen");
                            case 5 -> System.out.println("eight hundred and fifteen");
                            case 6 -> System.out.println("eight hundred and sixteen");
                            case 7 -> System.out.println("eight hundred and seventeen");
                            case 8 -> System.out.println("eight hundred and eighteen");
                            case 9 -> System.out.println("eight hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred");
                            case 1 -> System.out.println("eight hundred and twenty-one");
                            case 2 -> System.out.println("eight hundred and twenty-two");
                            case 3 -> System.out.println("eight hundred and twenty-three");
                            case 4 -> System.out.println("eight hundred and twenty-four");
                            case 5 -> System.out.println("eight hundred and twenty-five");
                            case 6 -> System.out.println("eight hundred and twenty-six");
                            case 7 -> System.out.println("eight hundred and twenty-seven");
                            case 8 -> System.out.println("eight hundred and twenty-eight");
                            case 9 -> System.out.println("eight hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and thirty");
                            case 1 -> System.out.println("eight hundred and thirty-one");
                            case 2 -> System.out.println("eight hundred and thirty-two");
                            case 3 -> System.out.println("eight hundred and thirty-three");
                            case 4 -> System.out.println("eight hundred and thirty-four");
                            case 5 -> System.out.println("eight hundred and thirty-five");
                            case 6 -> System.out.println("eight hundred and thirty-six");
                            case 7 -> System.out.println("eight hundred and thirty-seven");
                            case 8 -> System.out.println("eight hundred and thirty-eight");
                            case 9 -> System.out.println("eight hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and forty");
                            case 1 -> System.out.println("eight hundred and forty-one");
                            case 2 -> System.out.println("eight hundred and forty-two");
                            case 3 -> System.out.println("eight hundred and forty-three");
                            case 4 -> System.out.println("eight hundred and forty-four");
                            case 5 -> System.out.println("eight hundred and forty-five");
                            case 6 -> System.out.println("eight hundred and forty-six");
                            case 7 -> System.out.println("eight hundred and forty-seven");
                            case 8 -> System.out.println("eight hundred and forty-eight");
                            case 9 -> System.out.println("eight hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and fifty");
                            case 1 -> System.out.println("eight hundred and fifty-one");
                            case 2 -> System.out.println("eight hundred and fifty-two");
                            case 3 -> System.out.println("eight hundred and fifty-three");
                            case 4 -> System.out.println("eight hundred and fifty-four");
                            case 5 -> System.out.println("eight hundred and fifty-five");
                            case 6 -> System.out.println("eight hundred and fifty-six");
                            case 7 -> System.out.println("eight hundred and fifty-seven");
                            case 8 -> System.out.println("eight hundred and fifty-eight");
                            case 9 -> System.out.println("eight hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and sixty");
                            case 1 -> System.out.println("eight hundred and sixty-one");
                            case 2 -> System.out.println("eight hundred and sixty-two");
                            case 3 -> System.out.println("eight hundred and sixty-three");
                            case 4 -> System.out.println("eight hundred and sixty-four");
                            case 5 -> System.out.println("eight hundred and sixty-five");
                            case 6 -> System.out.println("eight hundred and sixty-six");
                            case 7 -> System.out.println("eight hundred and sixty-seven");
                            case 8 -> System.out.println("eight hundred and sixty-eight");
                            case 9 -> System.out.println("eight hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and seventy");
                            case 1 -> System.out.println("eight hundred and seventy-one");
                            case 2 -> System.out.println("eight hundred and seventy-two");
                            case 3 -> System.out.println("eight hundred and seventy-three");
                            case 4 -> System.out.println("eight hundred and seventy-four");
                            case 5 -> System.out.println("eight hundred and seventy-five");
                            case 6 -> System.out.println("eight hundred and seventy-six");
                            case 7 -> System.out.println("eight hundred and seventy-seven");
                            case 8 -> System.out.println("eight hundred and seventy-eight");
                            case 9 -> System.out.println("eight hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and eighty");
                            case 1 -> System.out.println("eight hundred and eighty-one");
                            case 2 -> System.out.println("eight hundred and eighty-two");
                            case 3 -> System.out.println("eight hundred and eighty-three");
                            case 4 -> System.out.println("eight hundred and eighty-four");
                            case 5 -> System.out.println("eight hundred and eighty-five");
                            case 6 -> System.out.println("eight hundred and eighty-six");
                            case 7 -> System.out.println("eight hundred and eighty-seven");
                            case 8 -> System.out.println("eight hundred and eighty-eight");
                            case 9 -> System.out.println("eight hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("eight hundred and ninety");
                            case 1 -> System.out.println("eight hundred and ninety-one");
                            case 2 -> System.out.println("eight hundred and ninety-two");
                            case 3 -> System.out.println("eight hundred and ninety-three");
                            case 4 -> System.out.println("eight hundred and ninety-four");
                            case 5 -> System.out.println("eight hundred and ninety-five");
                            case 6 -> System.out.println("eight hundred and ninety-six");
                            case 7 -> System.out.println("eight hundred and ninety-seven");
                            case 8 -> System.out.println("eight hundred and ninety-eight");
                            case 9 -> System.out.println("eight hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
            case 9 -> {
                switch (b) {
                    case 0 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred");
                            case 1 -> System.out.println("nine hundred and one");
                            case 2 -> System.out.println("nine hundred and two");
                            case 3 -> System.out.println("nine hundred and three");
                            case 4 -> System.out.println("nine hundred and four");
                            case 5 -> System.out.println("nine hundred and five");
                            case 6 -> System.out.println("nine hundred and six");
                            case 7 -> System.out.println("nine hundred and seven");
                            case 8 -> System.out.println("nine hundred and eight");
                            case 9 -> System.out.println("nine hundred and nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 1 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundredand ten");
                            case 1 -> System.out.println("nine hundred and eleven");
                            case 2 -> System.out.println("nine hundred and twelve ");
                            case 3 -> System.out.println("nine hundred and thirteen");
                            case 4 -> System.out.println("nine hundred and fourteen");
                            case 5 -> System.out.println("nine hundred and fifteen");
                            case 6 -> System.out.println("nine hundred and sixteen");
                            case 7 -> System.out.println("nine hundred and seventeen");
                            case 8 -> System.out.println("nine hundred and eighteen");
                            case 9 -> System.out.println("nine hundred and nineteen");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 2 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred");
                            case 1 -> System.out.println("nine hundred and twenty-one");
                            case 2 -> System.out.println("nine hundred and twenty-two");
                            case 3 -> System.out.println("nine hundred and twenty-three");
                            case 4 -> System.out.println("nine hundred and twenty-four");
                            case 5 -> System.out.println("nine hundred and twenty-five");
                            case 6 -> System.out.println("nine hundred and twenty-six");
                            case 7 -> System.out.println("nine hundred and twenty-seven");
                            case 8 -> System.out.println("nine hundred and twenty-eight");
                            case 9 -> System.out.println("nine hundred and twenty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 3 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and thirty");
                            case 1 -> System.out.println("nine hundred and thirty-one");
                            case 2 -> System.out.println("nine hundred and thirty-two");
                            case 3 -> System.out.println("nine hundred and thirty-three");
                            case 4 -> System.out.println("nine hundred and thirty-four");
                            case 5 -> System.out.println("nine hundred and thirty-five");
                            case 6 -> System.out.println("nine hundred and thirty-six");
                            case 7 -> System.out.println("nine hundred and thirty-seven");
                            case 8 -> System.out.println("nine hundred and thirty-eight");
                            case 9 -> System.out.println("nine hundred and thirty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 4 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and forty");
                            case 1 -> System.out.println("nine hundred and forty-one");
                            case 2 -> System.out.println("nine hundred and forty-two");
                            case 3 -> System.out.println("nine hundred and forty-three");
                            case 4 -> System.out.println("nine hundred and forty-four");
                            case 5 -> System.out.println("nine hundred and forty-five");
                            case 6 -> System.out.println("nine hundred and forty-six");
                            case 7 -> System.out.println("nine hundred and forty-seven");
                            case 8 -> System.out.println("nine hundred and forty-eight");
                            case 9 -> System.out.println("nine hundred and forty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 5 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and fifty");
                            case 1 -> System.out.println("nine hundred and fifty-one");
                            case 2 -> System.out.println("nine hundred and fifty-two");
                            case 3 -> System.out.println("nine hundred and fifty-three");
                            case 4 -> System.out.println("nine hundred and fifty-four");
                            case 5 -> System.out.println("nine hundred and fifty-five");
                            case 6 -> System.out.println("nine hundred and fifty-six");
                            case 7 -> System.out.println("nine hundred and fifty-seven");
                            case 8 -> System.out.println("nine hundred and fifty-eight");
                            case 9 -> System.out.println("nine hundred and fifty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 6 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and sixty");
                            case 1 -> System.out.println("nine hundred and sixty-one");
                            case 2 -> System.out.println("nine hundred and sixty-two");
                            case 3 -> System.out.println("nine hundred and sixty-three");
                            case 4 -> System.out.println("nine hundred and sixty-four");
                            case 5 -> System.out.println("nine hundred and sixty-five");
                            case 6 -> System.out.println("nine hundred and sixty-six");
                            case 7 -> System.out.println("nine hundred and sixty-seven");
                            case 8 -> System.out.println("nine hundred and sixty-eight");
                            case 9 -> System.out.println("nine hundred and sixty-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 7 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and seventy");
                            case 1 -> System.out.println("nine hundred and seventy-one");
                            case 2 -> System.out.println("nine hundred and seventy-two");
                            case 3 -> System.out.println("nine hundred and seventy-three");
                            case 4 -> System.out.println("nine hundred and seventy-four");
                            case 5 -> System.out.println("nine hundred and seventy-five");
                            case 6 -> System.out.println("nine hundred and seventy-six");
                            case 7 -> System.out.println("nine hundred and seventy-seven");
                            case 8 -> System.out.println("nine hundred and seventy-eight");
                            case 9 -> System.out.println("nine hundred and seventy-nine");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 8 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and eighty");
                            case 1 -> System.out.println("nine hundred and eighty-one");
                            case 2 -> System.out.println("nine hundred and eighty-two");
                            case 3 -> System.out.println("nine hundred and eighty-three");
                            case 4 -> System.out.println("nine hundred and eighty-four");
                            case 5 -> System.out.println("nine hundred and eighty-five");
                            case 6 -> System.out.println("nine hundred and eighty-six");
                            case 7 -> System.out.println("nine hundred and eighty-seven");
                            case 8 -> System.out.println("nine hundred and eighty-eight");
                            case 9 -> System.out.println("nine hundred and eighty-ninety");
                            default -> System.out.println("invalid input");
                        }
                    }
                    case 9 -> {
                        switch (c) {
                            case 0 -> System.out.println("nine hundred and ninety");
                            case 1 -> System.out.println("nine hundred and ninety-one");
                            case 2 -> System.out.println("nine hundred and ninety-two");
                            case 3 -> System.out.println("nine hundred and ninety-three");
                            case 4 -> System.out.println("nine hundred and ninety-four");
                            case 5 -> System.out.println("nine hundred and ninety-five");
                            case 6 -> System.out.println("nine hundred and ninety-six");
                            case 7 -> System.out.println("nine hundred and ninety-seven");
                            case 8 -> System.out.println("nine hundred and ninety-eight");
                            case 9 -> System.out.println("nine hundred and ninety-nine");
                            default -> System.out.println("invalid input");
                        }
                    }

                }
            }
        }
    }
}
