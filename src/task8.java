public class task8 {
    public static void main(String[] args) {
        var time = 640;
        var hour = 8;
        var sumPeople = time / hour;
        System.out.println("Всего работников в компании — " + sumPeople + " человек");
        sumPeople = sumPeople + 94;
        var allTime = sumPeople * hour;
        System.out.println("Если в компании работает " + sumPeople + " человек, то всего "+ allTime + " часов работы может быть поделено между сотрудниками");
    }
}
