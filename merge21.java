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
import static javaapplication2.MyModel1.myArray;
import static javaapplication2.merge1.f;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class merge21 {
    static JFrame f;
  public static void main(String[] args) {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel9 myArrayClass = new MyModel9();

    MyView9 panel = new MyView9(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    JButton nextButton=new JButton("Next");
    
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    f.getContentPane().add(nextButton, BorderLayout.EAST);
    nextButton.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new arraymerge().main(null);
                        new sortedarray().main(null);
                        f.dispose();
                        merge22.f.dispose();
                        merge23.f.dispose();
                        merge24.f.dispose();
            
			}
		});
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 1");
  }

   static void performSorting( MyModel9 myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView9 extends JPanel {
  MyModel9 myModel;
  public MyView9(MyModel9 myArrayClass) {
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

class SendArray9{
    static swaparray21 obj1 = new swaparray21();
    static int size = obj1.pp0.length;
    static int arr9[]= new int[size];
    public void add(int i, int n){
        arr9[i] = n;
    } 
}

class MyModel9 {
  static int myArray[];
  int arraySize;
  int res;
  swaparray21 obj1 = new swaparray21();
  int a[] = obj1.pp0;
  
  int size = a.length;
  MyView9 myView;
  public MyModel9() {
    arraySize = size;
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = a[i];
    }
  }
SendArray9 obj2 = new SendArray9();
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
    for(int i=0;i<myArray.length;i++)
        obj2.add(i, myArray[i]);
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


