package exercise;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

/**
 * シンプルなタイマー
 */
public class SimpleTimer extends JWindow {

    /**
     * 簡單的定時器
     */
    public static void main(String[] args) {

        SimpleTimer simpleTimer = new SimpleTimer();
        simpleTimer.pack();
        simpleTimer.setAlwaysOnTop(true);
        simpleTimer.setVisible(true);
    }

    private Long startTimeMillis;

    private JLabel label;

    private SimpleDateFormat dateFormat;

    private Timer timer;

    /**
     * 主要功能
     */
    public SimpleTimer() {

        initDateFormat();
        initConponents();
        resetTime();
        updateLabelText();
        startTimer();
    }

    /**
     * 日期格式的初始化(DateFormat的初始化)
     */
    private void initDateFormat() {

        dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /**
     * GUI組件初始化
     */
    private void initConponents() {

        label = new JLabel();
        label.setFont(new Font(label.getFont().getName(), Font.BOLD, 14));
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        label.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2));
        getContentPane().add(label);

        final JPopupMenu popup = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Reset");
        menuItem1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                resetTime();
            }
        });
        popup.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Exit");
        menuItem2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
        popup.add(menuItem2);
        label.setComponentPopupMenu(popup);

        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON2
                        && e.getClickCount() == 1) {
                    popup.setVisible(true);
                }
            }
        });
    }

    /**
     * 復位
     */
    private void resetTime() {

        startTimeMillis = Calendar.getInstance().getTimeInMillis();
    }

    /**
     * 標籤更新
     */
    private void updateLabelText() {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                long elapsedTime = Calendar.getInstance().getTimeInMillis()
                        - startTimeMillis;

                Date date = new Date(elapsedTime);

                label.setText(dateFormat.format(date));
            }
        });
    }

    /**
     * 定時器啟動
     */
    private void startTimer() {

        timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                updateLabelText();

            }
        }, 0, 1000);
    }
}