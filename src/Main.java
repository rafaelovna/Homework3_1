public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Совершеннолетие еще не наступило!");
        }

        System.out.println("Задание 2");
        int peopleAge = 19;
        if (peopleAge >= 7 && peopleAge < 18) {
            System.out.println("Ребенок ходит в школу!");
        } else if (peopleAge >= 18 && peopleAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        } else if (peopleAge >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу!");
        }

        System.out.println("Задание 3");
        int carCapacity = 104;
        if (carCapacity <= 60){
            System.out.println("В вагоне есть сидячие места");
        }else if (carCapacity <= 102){
            System.out.println("В вагоне нет сидячих мест!В вагоне есть стоячие места!");
        }else {
            System.out.println("В вагоне нет мест!");
        }

        System.out.println("Задание 3.1");
        int capacity = 103;
        int sittingPlace = 60;
        int standingPlace = capacity - sittingPlace;

        int sitUsed = 40;
        int standUsed = 43;
        if (sitUsed < sittingPlace){
            System.out.println("В вагоне есть "+(sittingPlace - sitUsed)+" сидячих мест!");
        } else {
            System.out.println("В вагоне нет сидячих мест!");
        }
        if (standingPlace < sitUsed){
            System.out.println("В вагоне есть "+(standingPlace - standUsed)+" стоячих мест!");
        } else {
            System.out.println("В вагоне нет стоячих мест!");
        }
    }
}