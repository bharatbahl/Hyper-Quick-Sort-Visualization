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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	static String t=firstpage.t.getText();
	  static String a[]=t.split(",");
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel myArrayClass = new MyModel();

    MyView panel = new MyView(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    JButton nextButton = new JButton("NEXT");
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    nextButton.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new swaparray().main(null);
			new merge1().main(null);
                        new merge2().main(null);
                        new merge3().main(null);
                        new merge4().main(null);
                        f.dispose();
                        main2.f.dispose();
                        main3.f.dispose();
                        main4.f.dispose();
            
			}
		});
    f.getContentPane().add(nextButton,BorderLayout.EAST);
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 1");
  }

   static void performSorting( MyModel myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView extends JPanel {
  MyModel myModel;
  public MyView(MyModel myArrayClass) {
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

class SendArray{
    static String t=firstpage.t.getText();
    static String a[]=t.split(",");
    static int size = a.length;
    static int arr[]= new int[size/4];
    public void add(int i, int n){
        arr[i] = n;
    }   
}

class MyModel {
  static int myArray[];
  int arraySize;
  int res;
 	  String t=firstpage.t.getText();
	  String a[]=t.split(",");
          int size = a.length;
  MyView myView;
  public MyModel() {

    arraySize = (int)(size/4);
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = Integer.parseInt(a[i]);
    }
  }
  SendArray obj1 = new SendArray();
  public void QuickSort(int Left, int Right) {
    if (Right - Left <= 0) {
      return;
    } else {
      int Pivot = myArray[Right];
      Partitioning(Left, Right, Pivot);
      int PivotValue = res;
      QuickSort(Left, PivotValue - 1);
      QuickSort(PivotValue + 1, Right);
    }
    for(int i=0;i<myArray.length;i++){
        obj1.add(i, myArray[i]);
    }	
  }

  public void Partitioning(int Left, int Right, int Pivot) {
    int LeftP = Left - 1;
    int RightP = Right;
    while (true) {
      while (LeftP < Right && myArray[++LeftP] < Pivot) {
      }
      while (RightP > 0 && myArray[--RightP] > Pivot) {
      }
      if (RightP <= LeftP) {
        SwapValues(LeftP, Right);
        res = LeftP;
        break;
      } else {
        SwapValues(LeftP, RightP);
        break;
      }
    }
  }

  private void SwapValues(int LeftP, int RightP) {
    int aux = myArray[LeftP];
    myArray[LeftP] = myArray[RightP];
    myArray[RightP] = aux;

    try {
      Thread.sleep(150);
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }
    myView.repaint();
  }
}

