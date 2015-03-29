class File
{
    private String name;
	
    public File(String name)
    {
        this.name = name;
    }
    public void ls()
    {
        System.out.println(" - "+name);
    }

}

class Directory
{
    private String name;
    private ArrayList files = new ArrayList();
	
    public Directory(String name)
    {
        this.name = name;
    }
    public void add(Object obj)
    {
        this.files.add(obj);
    }
    public void ls()
    {
        System.out.println(name);
        for (int i = 0; i < this.files.size(); ++i)
        {
            Object obj = files.get(i);
            // Recover the type of this object
            if (obj.getClass().getName().equals("Directory"))
              ((Directory)obj).ls();
            else
              ((File)obj).ls();
        }
    }
}

publicclass CompositeDemo
{
    public static StringBuffer g_indent = new StringBuffer();

    public static void main(String[] args)
    {
        Directory one = new Directory("dir111"), two = new Directory("dir222"),
          thr = new Directory("dir333");
        File a = new File("a"), b = new File("b"), c = new File("c"), d = new
          File("d"), e = new File("e");
        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(thr);
        thr.add(e);
        one.ls();
    }
}