package main;

public class Synhronize
{
    public static class Main
    {

        static class Resource
        {
            private int count;

            public int getCount() {
                return count;
            }

            public synchronized void setCount(int count) {
                this.count = count;
            }

            public synchronized void changeCount()
            {

                setCount(++count);

            }
        }



         static class MyThread extends Thread
        {
            Resource resource = new Resource();

            public synchronized void setResource(Resource resource)
            {
                this.resource = resource;
            }

            @Override
            public void run(){
                resource.changeCount();
            }
        }


        public static void main(String[] args) throws InterruptedException {


            for(int i = 0 ; i < 5000; ++i) {
                Resource resource = new Resource();
                resource.setCount(5);

                MyThread myThread1 = new MyThread();
                MyThread myThread2 = new MyThread();

                myThread1.setName("one");

                myThread1.setResource(resource);
                myThread2.setResource(resource);

                myThread1.start();
                myThread2.start();
                myThread1.join();
                myThread2.join();


                System.out.println(resource.getCount());
            }

        }




    }

}
