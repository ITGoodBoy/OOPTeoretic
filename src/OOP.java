public class OOP {

    /*
    ������ �� ��� ������� � �������������� ��������� ���: https://github.com/ITGoodBoy/Zoo � https://github.com/ITGoodBoy/OOP
    ���� 4 ������� �������� ��� � java: ������������, ������������, �����������, ����������
    ������������ - ������� ����������. �������� ��������� ���������, �� �������� ��� �������� �� ���� ������ � ��� ����� ����������, ��� ��������� ���������
    �������� �������������(������������ �������, �������� ���� �� ������, ������� ��� �����, �������� �������� ���� � ��.).
    � Java ��� ���������� ���������� � ������� ������������ private, � ����� �������� public �������� � �������� ��� ����������.
    � ��� ������������?
    ������� �� �������:
    1)��� ������������� ������������
     */

    static class Human
    {
        int age;
        int accountBalance;

        public static void main(String[] args) {
            Human human = new Human();
            human.accountBalance = 89;
            human.age = 19;
            System.out.println("account balance " + human.accountBalance + " age " + human.age);
        }
    }

    /*
    �� ����� ����� ������� � ����������� ������� � ������ �� �����, �� ����� �������� �� ��������, ������ �� � ��������,
    �� ��� ���� ������� �������� ������ � ����� ������������� ������� ��� ������������� ������?������ ���� �� ����� ����.
    ������, ��� ����� ����������� ��������. � ��� ��� �������? - �����, � ������� �������� � ��������.
    2)� �������������� ������������
     */

    static class Human2
    {

        private int accountBalance;
        private int age;

        public static void main(String[] args) {
            Human2 human2 = new Human2();
            human2.setAge(0);
            human2.setAccountBalance(-140);
            System.out.println("account balance " + human2.getAccountBalance() + " age " + human2.getAge());
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 2) {
                System.out.println("������, ������� ������ ��� �������������");
                throw new IndexOutOfBoundsException();
            }
            if (age > 200)
            {
                System.out.println("������, ������� ������� �������");
                throw new IndexOutOfBoundsException();

            }
            this.age = age;
        }

        public int getAccountBalance() {
            return accountBalance;
        }

        public void setAccountBalance(int accountBalance) {
            if (accountBalance < 0)
            {
                System.out.println("���� �� ����� ���� �������������");
                throw new IndexOutOfBoundsException();

            }
            this.accountBalance = accountBalance;
        }
    }

    /*
    ��� ���� ������� ������, ������ ��� �� ������� ������� ������ 0, �� ����� ������������� ������, ��� � ��� ���� �� ����������� ������������.
    2)������������. ������������ ��� �������� ������� �������� �������� ������� � ���������� ����� ������������ � ���� �������:
     */

    class Animal
    {
        //����� �������� ����� ���, ������� � ���.
        private String name;
        private int age;
        private boolean gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

    }

    //�� �� ����� �������� ����� ������.
    class Bird extends Animal
    {
        //����� ������?(�������� ������� ���).
        private boolean fly;
        private int flyingHeight;
        private int airspeed;

        public boolean isFly() {
            return fly;
        }

        public void setFly(boolean fly) {
            this.fly = fly;
        }

        public int getFlyingHeight() {
            return flyingHeight;
        }

        public void setFlyingHeight(int flyingHeight) {
            this.flyingHeight = flyingHeight;
        }

        public int getAirspeed() {
            return airspeed;
        }

        public void setAirspeed(int airspeed) {
            this.airspeed = airspeed;
        }
    }

    /*
    ��� ���� ������������� ������������ ������������. �� ������� ����� Animal � ������ ��� ������� � ��� � ����� ������������� Bird �� Animal,
    ��� �����  ����� ���, ������� � ���, �� �� ��� �������� ����� ������. ������ �� ������ Bird �� ����� ����������� ����� �������� ���
    ������, �������, �������, �������, ���� � �� �� ������ ������������� � ��� ���� �� ����������� ��������� ���� ����!!!

    ����������� - ��������� ����������. ������������ ������������ � ��� ��� �� ����� ������������ ���� �����, ������� ��� ������� ������ ������� ����� �����.
    ������:
     */

    static class Singer
    {
        public void Voice()
        {
            System.out.print("� ��� ��� ");
        }

        public static void main(String[] args) {
            Singer singer = new AniLorak();
            singer.Voice();
            singer = new Baskov();
            singer.Voice();
            singer = new I();
            singer.Voice();
        }
    }

    static class Baskov extends Singer
    {
        @Override
        public void Voice() {
            super.Voice();
            System.out.print("������");
            System.out.println();
        }
    }

    static class AniLorak extends Singer
    {
        @Override
        public void Voice() {
            super.Voice();
            System.out.print("��� �����");
            System.out.println();
        }
    }

    static class I extends Singer
    {
        @Override
        public void Voice() {
            System.out.print("������ ����(((");
            System.out.println();
        }
    }
}


/*� ������� ���� �� ����� ���� � ���� ����� Voice, �� � �� �� ����� ������ ����� ������� ����������� �� Singer ��� �� ������, ��� � ���� ���� �� ����������� ������������.

����������. ��� ������ ��������� ����������, �� �� �������:
���� ����� ������, � ����� �� �������� ���������� ���, �������, ��� � ������ �����, ������, ���. ��� ������ ����� ����� ����� �����, �������� ����, ���� ������ � �.�.
������ ��� ����������� ������� ��� ���������� ���� ��������� ����������. ��� � ���� ����������.
 */
