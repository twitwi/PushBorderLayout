# PushBorderLayout

A BorderLayout that accepts any number of components within (without requiring to nest JPanels).
There is also a [Scala version](http://github.com/twitwi/PushBorderLayoutScala).

See also a [quick post on it](http://home.heeere.com/tech-push-border-layout.html).

Example use:

    ...
    public static void main(String[] args) {
        JFrame f = new JFrame("PushBorderLayout !");
        Container c = f.getContentPane();
        c.setLayout(new PushBorderLayout());
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.LINE_END);
        c.add(newComponent(), PushBorderLayout.PAGE_START);
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.PAGE_END);
        c.add(PushBorderLayout.pad(10), PushBorderLayout.PAGE_END);
        c.add(newComponent(), PushBorderLayout.PAGE_END);
        c.add(newComponent(), PushBorderLayout.LINE_END);
        c.add(PushBorderLayout.pad(10), PushBorderLayout.LINE_END);
        c.add(newComponent());
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

