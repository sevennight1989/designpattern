package af.co.design;

import java.util.Enumeration;

import af.co.design.adapter.ClassAdapter;
import af.co.design.adapter.ObjectWapper;
import af.co.design.adapter.Source;
import af.co.design.adapter.SourceSub1;
import af.co.design.adapter.SourceSub2;
import af.co.design.bridge.Bridge;
import af.co.design.bridge.MyBridge;
import af.co.design.command.Command;
import af.co.design.command.Invoker;
import af.co.design.command.MyCommand;
import af.co.design.command.Receiver;
import af.co.design.compsite.Tree;
import af.co.design.compsite.TreeNode;
import af.co.design.cor.MyHandler;
import af.co.design.decorator.Decorator;
import af.co.design.decorator.Sourceable;
import af.co.design.facade.Computer;
import af.co.design.factory.AbstractFactory;
import af.co.design.factory.AbstractFactory.Food;
import af.co.design.factory.FactoryMethod;
import af.co.design.flyweight.FlyweightFactory;
import af.co.design.iterator.Collection;
import af.co.design.iterator.Iterator;
import af.co.design.iterator.MyCollection;
import af.co.design.mediator.Mediator;
import af.co.design.mediator.MyMediator;
import af.co.design.memento.Original;
import af.co.design.memento.Storage;
import af.co.design.observer.MySubject;
import af.co.design.observer.Observer1;
import af.co.design.observer.Observer2;
import af.co.design.observer.Subject;
import af.co.design.proxy.Proxy;
import af.co.design.state.Context;
import af.co.design.state.State;
import af.co.design.strategy.ICalculator;
import af.co.design.strategy.Minus;
import af.co.design.strategy.Multiply;
import af.co.design.strategy.Plus;
import af.co.design.utils.Log;
import af.co.design.visitor.VisitorDemo;

public class Main {
    public static void main(String[] args) {
        FactoryMethod.Food f = get("B");
        if (f != null) {
            f.printFood();

        }
        Log.splitLine();
        Food food = getA();
        food.printFood();
        Log.splitLine();
        SingletonExt.getInstance().printMsg();
        Log.splitLine();
        Student student = new Student.StudentBuilder().setage(20)
                .setName("Tom").setNumber(18).setSex("man")
                .setSchool("YuCaizhongxue").build();
        Log.d(student.toString());
        Protype p1 = new Protype();
        p1.setName("张三");
        Protype p2 = null;
        try {
            p2 = (Protype) p1.clone();
            p2.setName("李四");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 这里修改P2的name不会影响P1的name，如果直接使用P1赋值，或者new对象再使用P1赋值都会修改P1的name
        p2.setName("李四");
        Log.d("P1 Name: " + p1.getName());
        Log.d("P2 Name: " + p2.getName());
        Log.splitLine();
        ClassAdapter ca = new ClassAdapter();
        ca.method1();
        ca.method2();
        Log.splitLine();

        ObjectWapper ow = new ObjectWapper(new Source());
        ow.method1();
        ow.method2();
        Log.splitLine();
        SourceSub1 ssb1 = new SourceSub1();
        SourceSub2 ssb2 = new SourceSub2();
        ssb1.method1();
        ssb1.method2();
        ssb2.method1();
        ssb2.method2();
        Log.splitLine();

        // 代理模式和装饰着模式区别，代理模式在编译时就知道被代理的对象，而装饰者只有在运行阶段才知道被装饰对象，需要在
        // 装饰的类的构造函数中传入被装饰的对象
        Sourceable source = new af.co.design.decorator.Source();
        Sourceable obj = new Decorator(source);
        obj.method();

        Log.splitLine();

        Sourceable proxy = new Proxy();
        proxy.method();
        Log.splitLine();

        Computer computer = new Computer();
        computer.startUp();
        computer.shutDown();
        Log.splitLine();

        Bridge bridge = new MyBridge();
        Sourceable sourceable1 = new af.co.design.bridge.SourceSub1();
        bridge.setSource(sourceable1);
        bridge.method();

        Sourceable sourceable2 = new af.co.design.bridge.SourceSub2();
        bridge.setSource(sourceable2);
        bridge.method();
        Log.splitLine();

        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        nodeC.add(nodeD);
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        Log.d("Buid Tree finish!");
        Log.d(tree.root.getName());
        Enumeration<TreeNode> children = tree.root.getChildren();
        printTreeName(children);
        Log.splitLine();

        String name = "Tom";
        FlyweightFactory ff = new FlyweightFactory();
        String rName = (String) ff.getFlyweight(name).getObj();
        Log.d("rName = " + rName);
        String tName = (String) ff.getFlyweight(name).getObj();
        Log.d("tName = " + tName);

        Log.splitLine();
        String exp_1 = "2+8";
        String exp_2 = "5-2";
        String exp_3 = "2*7";
        ICalculator cal_1 = new Plus();
        ICalculator cal_2 = new Minus();
        ICalculator cal_3 = new Multiply();
        int ret_1 = cal_1.calculate(exp_1);
        int ret_2 = cal_2.calculate(exp_2);
        int ret_3 = cal_3.calculate(exp_3);
        Log.d("ret_1 = " + ret_1);
        Log.d("ret_2 = " + ret_2);
        Log.d("ret_3 = " + ret_3);

        Log.splitLine();
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
        Log.splitLine();

        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Log.d(iterator.next().toString());
        }
        Log.splitLine();

        MyHandler h1 = new MyHandler("H1");
        MyHandler h2 = new MyHandler("H2");
        MyHandler h3 = new MyHandler("H3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operation();
        Log.splitLine();

        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
        Log.splitLine();
        // 创建原始类
        Original original = new Original("egg");
        // 创建备忘录
        Storage storage = new Storage(original.createMemento());
        // 修改原始类的状态
        Log.d("初始化状态为: " + original.getValue());
        original.setValue("niu");
        Log.d("修改后的状态为: " + original.getValue());
        // 回复原始类的状态
        original.restoreMemento(storage.getMemento());
        Log.d("恢复后的状态为: " + original.getValue());
        Log.splitLine();

        State state = new State();
        Context context = new Context(state);
        state.setValue("state1");
        context.method();
        state.setValue("state2");
        context.method();
        state.setValue("state");
        context.method();
        Log.splitLine();

        VisitorDemo.Service saving = new VisitorDemo.Saving();
        VisitorDemo.Service fund = new VisitorDemo.Fund();
        VisitorDemo.Service draw = new VisitorDemo.Draw();
        VisitorDemo.Visitor visitor = new VisitorDemo.Visitor();
        VisitorDemo.Visitor guweiwei= new VisitorDemo.Visitor();
        fund.accept(guweiwei);
        saving.accept(visitor);
        fund.accept(visitor);
        draw.accept(visitor);
        Log.splitLine();

        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
        Log.splitLine();

        int ret = new af.co.design.interpreter.Minus().interpret(new af.co.design.interpreter.Context(
                new af.co.design.interpreter.Plus().interpret(new af.co.design.interpreter.Context(9,2)),8
        ));
        Log.d("ret = " + ret);

    }

    //递归遍历子节点
    private static void printTreeName(Enumeration<TreeNode> children) {
        while (children.hasMoreElements()) {
            TreeNode node = children.nextElement();
            Log.d(node.getName());
            if (node.getChildren().hasMoreElements()) {
                printTreeName(node.getChildren());
            }
        }
    }

    private static FactoryMethod.Food get(String name) {
        if ("A".equals(name)) {
            return FactoryMethod.StaticFactory.getA();
        } else if ("B".equals(name)) {
            return FactoryMethod.StaticFactory.getB();
        } else if ("C".equals(name)) {
            return FactoryMethod.StaticFactory.getC();
        }
        return null;
    }

    private static AbstractFactory.Food getA() {
        Food food = new AbstractFactory.FactoryForA().get();
        return food;
    }

}
