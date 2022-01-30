import java.util.Scanner;

public class BurcBulan {
    public static void main(String[] args) {

        int month, day;
        String burc = " ";
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ay :");
        month = scanner.nextInt();
        System.out.println("Gun");
        day = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 1) {
                if (day <= 31 && day > 0) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (day <= 28 && day > 0) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (day <= 31 && day > 0) {
                    if (day < 21) {
                        burc = "Balik";
                    } else {
                        burc = "Koc";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if (day <= 30 && day > 0) {
                    if (day < 21) {
                        burc = "Koc";
                    } else {
                        burc = "Boga";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if (day <= 31 && day > 0) {
                    if (day < 22) {
                        burc = "Boga";
                    } else {
                        burc = "Ikizler";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if (day <= 30 && day > 0) {
                    if (day < 23) {
                        burc = "Ikizler";
                    } else {
                        burc = "Yengec";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if (day <= 31 && day > 0) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if (day <= 31 && day > 0) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if (day <= 30 && day > 0) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if (day <= 31 && day > 0) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if (day <= 30 && day > 0) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 12) {
                if (day <= 31 && day > 0) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            if (isError) {
                System.out.println("Hatalı giriş yapınız,");
            } else {
                System.out.println(" Burcunuz : " + burc);
            }
        } else {
            System.out.println(" Ayi yanlis Girdiniz... ");
        }
    }
}

