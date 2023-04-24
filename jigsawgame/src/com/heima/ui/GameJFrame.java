package com.heima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @ClassName GameJFrame
 * @Description 游戏界面
 * @Author AsuraTu
 * @Date 2023/4/23 11:11
 * @Version 1.0.0
 */
public class GameJFrame extends JFrame implements KeyListener {
    // 记录空白标签的位置
    int blankX = 0;
    int blankY = 0;

    // 记录图片的二维数组
    String[][] imageNames;

    // 图片路径
    String imagePath = "";

    // 记录步数
    int step = 0;

    // 正确的二维数组
    String[][] rightImageNames;

    public GameJFrame() {
        // 初始化窗体
        initJFrame();

        // 初始化菜单
        initMenu();

        // 初始化图片路径
        initImagePath();

        // 初始化图片数组
        initImageArr();

        // 初始化正确的二维数组
        initRightImageArr();

        // 打乱数组
        upsetImage();

        // 初始化图片
        initImage();


        // 设置窗体的可见性, 这个要放在最后
        this.setVisible(true);
    }

    private void initImagePath() {
        // 随机获取 0到1
        String type = (int) (Math.random() * 2) == 1 ? "animal" : "girl";
        // 随机获取1到8
        int index = (int) (Math.random() * 8) + 1;
        // 更换图片
        this.imagePath = "jigsawgame/image/" + type + "/" + type + index + "/";
    }

    private void initImageArr() {
        // 将 1.jpg 到 16.jpg 放到一个二维数组中, 每行 4 个
        this.imageNames = new String[4][4];

        // 1.jpg 到 16.jpg
        for (int i = 0; i < imageNames.length; i++) {
            for (int j = 0; j < imageNames[i].length; j++) {
                // 1.jpg 到 16.jpg
                int index = i * 4 + j + 1;

                // 如果是最后一个标签, 就不需要设置图片
                if (index == 16) {
                    imageNames[i][j] = "";
                    continue;
                }

                imageNames[i][j] = this.imagePath + index + ".jpg";
                System.out.println(imageNames[i][j]);
            }
        }
    }

    // 初始化正确的二维数组
    private void initRightImageArr() {
        // 复制到正确的二维数组, 用于判断是否拼图成功
        this.rightImageNames = new String[4][4];
        for (int i = 0; i < rightImageNames.length; i++) {
            System.arraycopy(imageNames[i], 0, rightImageNames[i], 0, rightImageNames[i].length);
        }
    }

    // 判断是否拼图成功
    private boolean isWin() {
        for (int i = 0; i < rightImageNames.length; i++) {
            for (int j = 0; j < rightImageNames[i].length; j++) {
                if (!rightImageNames[i][j].equals(imageNames[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // 打乱数组
    private void upsetImage() {
        // 打乱数组
        for (int i = 0; i < imageNames.length; i++) {
            for (int j = 0; j < imageNames[i].length; j++) {
                // 0 - 15
                int index = (int) (Math.random() * 16);
                // 0 - 3
                int row = index / 4;
                // 0 - 3
                int col = index % 4;
                // 交换
                String temp = imageNames[i][j];
                imageNames[i][j] = imageNames[row][col];
                imageNames[row][col] = temp;
            }
        }
    }

    private void initImage() {
        // 重置所有的图片
        this.getContentPane().removeAll();

        // 显示步数
        JLabel stepLabel = new JLabel("步数: " + this.step);
        stepLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepLabel);

        // 判断是否拼图成功
        if (isWin()) {
            // 显示胜利的图片
            ImageIcon winIcon = new ImageIcon("jigsawgame/image/win.png");
            JLabel winLabel = new JLabel(winIcon);
            winLabel.setBounds(203, 283, winIcon.getIconWidth(), winIcon.getIconHeight());
            this.getContentPane().add(winLabel);
        }

        // 创建 16 个图片标签
        for (int i = 0; i < imageNames.length; i++) {
            for (int j = 0; j < imageNames[i].length; j++) {
                if ("".equals(imageNames[i][j])) {
                    blankX = j;
                    blankY = i;
                }

                // 创建一个标签
                JLabel label = new JLabel();
                // 创建一个图片对象
                ImageIcon imageIcon = new ImageIcon(imageNames[i][j]);
                // 指定图片位置
                label.setBounds(83 + j * 105, 134 + i * 105, 105, 105);
                // 设置图片的边框
                label.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 设置图片
                label.setIcon(imageIcon);
                // 将标签添加到窗体中
                this.getContentPane().add(label);
            }
        }

        System.out.println("空白标签的位置: " + blankX + ", " + blankY);

        // 先加载的图片在上面, 后加载的图片在下面
        // 所以最后加载背景图片
        loadBgImage();

        // 重新绘制窗体
        this.getContentPane().repaint();
    }

    // 加载背景图片
    private void loadBgImage() {
        // 设置背景图片
        ImageIcon bgIcon = new ImageIcon("jigsawgame/image/background.png");
        JLabel bgLabel = new JLabel(bgIcon);
        // 设置背景图片的位置
        bgLabel.setBounds(40, 40, bgIcon.getIconWidth(), bgIcon.getIconHeight());
        // 将背景图片添加到窗体中
        this.getContentPane().add(bgLabel);
    }

    private void initJFrame() {
        // 设置窗体的标题
        this.setTitle("拼图游戏");
        // 设置窗体的大小
        this.setSize(603, 680);
        // 设置窗体的位置
        this.setLocationRelativeTo(null);
        // 设置窗体的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体置顶
        this.setAlwaysOnTop(true);
        // 设置窗体的布局
        this.setLayout(null);

        // 添加键盘监听事件
        this.addKeyListener(this);

    }

    /**
     * 初始化菜单
     */
    private void initMenu() {
        // 创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        // 创建菜单 (功能 关于我们)
        JMenu menu = new JMenu("功能");
        // 创建功能栏目的菜单项 (更换图片, 重新游戏, 重新登录, 关闭游戏)
        JMenuItem changeImageItem = new JMenuItem("更换图片");
        // 点击更换图片
        changeImageItem.addActionListener(e -> {
            // 初始化图片路径
            initImagePath();

            // 初始化图片数组
            initImageArr();

            // 初始化正确的二维数组
            initRightImageArr();

            // 打乱数组
            upsetImage();

            // 初始化图片
            initImage();

            // 重置步数
            step = 0;
        });
        JMenuItem restartItem = new JMenuItem("重新游戏");
        // 点击重新游戏
        restartItem.addActionListener(e -> {
            // 重新打乱图片
            upsetImage();
            // 重置步数
            step = 0;
            // 重新加载图片
            initImage();
        });

        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem exitItem = new JMenuItem("关闭游戏");
        // 点击关闭游戏
        exitItem.addActionListener(e -> {
            // 关闭窗体
            this.dispose();
        });
        // 将菜单项添加到菜单中
        menu.add(changeImageItem);
        menu.add(restartItem);
        menu.add(reloginItem);
        menu.add(exitItem);

        JMenu aboutMenu = new JMenu("关于我们");
        // 公众号
        JMenuItem gzhItem = new JMenuItem("公众号");
        aboutMenu.add(gzhItem);

        // 将菜单栏设置到窗体中
        menuBar.add(menu);
        menuBar.add(aboutMenu);
        this.setJMenuBar(menuBar);
    }

    // keyTyped 键盘输入
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // keyPressed 和 keyReleased 的区别
    // keyPressed 和 keyReleased 都是键盘按下和释放
    // keyPressed 是按下就会触发
    // keyReleased 是按下后释放才会触发

    @Override
    public void keyPressed(KeyEvent e) {
        int Code = e.getKeyCode();

        // 按下 A
        if (Code == KeyEvent.VK_A) {
            // 删除所有的图片
            this.getContentPane().removeAll();
            // 加载完整图片
            loadFullImage();
            // 加载背景图片
            loadBgImage();
            // 重新绘制窗体
            this.getContentPane().repaint();
        }

        // 按下 w, 直接胜利
        if (Code == KeyEvent.VK_W) {
            initImageArr();
            initImage();
        }

    }

    private void loadFullImage() {
        // 创建一个标签
        JLabel label = new JLabel();
        // 创建一个图片对象
        ImageIcon imageIcon = new ImageIcon(this.imagePath + "all.jpg");
        // 指定图片位置
        label.setBounds(83, 134, 420, 420);
        // 设置图片的边框
        label.setBorder(new BevelBorder(BevelBorder.LOWERED));
        // 设置图片
        label.setIcon(imageIcon);
        // 将标签添加到窗体中
        this.getContentPane().add(label);
    }

    // keyReleased 键盘释放
    @Override
    public void keyReleased(KeyEvent e) {
        // 如果已经胜利, 就不需要移动
        if (isWin()) {
            return;
        }

        // 获取键盘输入的值
        int Code = e.getKeyCode();

        switch (Code) {
            case KeyEvent.VK_UP -> pressTop();
            case KeyEvent.VK_DOWN -> pressBottom();
            case KeyEvent.VK_LEFT -> pressLeft();
            case KeyEvent.VK_RIGHT -> pressRight();
            // 如果是 a 或者 w 键
            case KeyEvent.VK_A, KeyEvent.VK_W -> initImage();
        }

    }

    private void pressRight() {
        // 如果空白标签在第一列, 就不需要移动
        if (blankX == 0) {
            System.out.println("空白标签在第一列, 不能移动");
            return;
        }

        // 交换图片
        String temp = imageNames[blankY][blankX];
        imageNames[blankY][blankX] = imageNames[blankY][blankX - 1];
        imageNames[blankY][blankX - 1] = temp;

        step++;

        initImage();
    }

    private void pressLeft() {
        // 如果空白标签在最后一列, 就不需要移动
        if (blankX == 3) {
            System.out.println("空白标签在最后一列, 不能移动");
            return;
        }

        // 交换图片
        String temp = imageNames[blankY][blankX];
        imageNames[blankY][blankX] = imageNames[blankY][blankX + 1];
        imageNames[blankY][blankX + 1] = temp;

        step++;

        initImage();
    }

    private void pressBottom() {
        // 如果空白标签在第一行, 就不需要移动
        if (blankY == 0) {
            System.out.println("空白标签在第一行, 不能移动");
            return;
        }

        // 交换图片
        String temp = imageNames[blankY][blankX];
        imageNames[blankY][blankX] = imageNames[blankY - 1][blankX];
        imageNames[blankY - 1][blankX] = temp;

        step++;

        initImage();
    }

    private void pressTop() {
        // 如果空白标签在最后一行, 就不需要移动
        if (blankY == 3) {
            System.out.println("空白标签在最后一行, 不能移动");
            return;
        }

        // 交换图片
        String temp = imageNames[blankY][blankX];
        imageNames[blankY][blankX] = imageNames[blankY + 1][blankX];
        imageNames[blankY + 1][blankX] = temp;

        step++;

        initImage();
    }
}
