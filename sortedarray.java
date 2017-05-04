/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author adityangt
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import static javaapplication2.MyModel1.myArray;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sortedarray {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel13 myArrayClass = new MyModel13();

    MyView13 panel = new MyView13(myArrayClass);
    myArrayClass.myView = panel;
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("Sorted Array");
  }
}
class MyView13 extends JPanel {
  MyModel13 myModel;
  public MyView13(MyModel13 myArrayClass) {
    this.myModel = myArrayClass;
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    int size = myModel.arraySize;
    int barWidth = getWidth() / size;
    for (int i = 0; i < size; i++) {
      int value = myModel.myArray[i];
      int x = i * barWidth;
      int y = getHeight() - value;
      g.drawString(value+"",x+barWidth/2,y);
      g.fillRect(x + 1, y, barWidth - 2, value);
    }
  }
}


class MyModel13 {
  static int myArray[];
  int arraySize;
  int res;
  arraymerge obj1 = new arraymerge();
  int a[] = obj1.pp2;
  
  int size = a.length;
  MyView13 myView;
  public MyModel13() {
    arraySize = size;
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = a[i];
    }
  }
}


