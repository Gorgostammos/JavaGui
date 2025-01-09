package no.hiof.gorgos.oblig5.forms;


import no.hiof.gorgos.oblig5.models.Franchises;
import no.hiof.gorgos.oblig5.models.Game;
import no.hiof.gorgos.oblig5.models.GameDelvper;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Oblig5_GUI extends JFrame {
    private JPanel mainPanel;
    private JButton editButton;
    private JTextField gameNameField;
    private JTextField katagoriField;
    private JTextField ratingField;
    private JButton addButton;
    private JList<Game> list1;
    private JPanel page2;
    private JPanel page1;
    private JPanel gameLayout;
    private JList<Game> list2;
    private JButton slettKnap;
    private JButton tilbakePage1;
    private JButton seListaButton;
    private JPanel page3;
    private JButton franchisesButton;
    private JTextField franchisFiled;
    private JTextField nyesteSpillFiled;
    private JTextField ratingFiledFran;
    private JTextField katagoriFiledFran;
    private JTextField antallSpilleField;
    private JButton addFranchies;
    private JButton endreButtonFran;
    private JButton franchisList;
    private JButton hjemButton;
    private JList<Franchises> list3;
    private JTextField platformField;
    private JTextField platformFieldFran;
    private JPanel page4;
    private JList<Franchises> list4;
    private JButton slettButtonFran1;
    private JButton tilbakeTilFranList;
    private JPanel page5;
    private JTextField develperFieldPage5;
    private JTextField KatagoriSpecialtyFirld;
    private JTextField NotabelFranchisesField;
    private JButton adddeveleper;
    private JButton editDevelperButton1;
    private JList<GameDelvper> list5;
    private JTextField devlperField;
    private JTextField develperFieldInFran;
    private JTextField foundedField1;
    private JButton develperButton;
    private JButton slettDevllperButton;
    private JButton tilbaketilPage1Button;


    private final DefaultListModel<Game> gameListModel = new DefaultListModel<>();
    private final DefaultListModel<Franchises> franchisesDefaultListModel = new DefaultListModel<>();
    private final DefaultListModel<GameDelvper> delvperDefaultListModel = new DefaultListModel<>();


    public Oblig5_GUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        list1.setModel(gameListModel);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String gameName = gameNameField.getText();
                    String katagori = katagoriField.getText();
                    double rating = Double.parseDouble(ratingField.getText());
                    String platform = platformField.getText();
                    String develper = devlperField.getText();

                    Game addGame = new Game(gameName, katagori, rating, platform, develper);

                    gameListModel.addElement(addGame);

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must put a double value for Rating");
                }

            }
        });


        seListaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page2);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });


        tilbakePage1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page1);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });


        franchisesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page3);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });


        develperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page5);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });



        list2.setModel(gameListModel);


        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String gameName = gameNameField.getText();
                    String katagori = katagoriField.getText();
                    double rating = Double.parseDouble(ratingField.getText());
                    String platform = platformField.getText();
                    String develper = devlperField.getText();


                    // Henter ut en referanse til det selekterte game_objektet i JList-en og oppdaterer dets gamenavn og
                    // katagori, rating, og Platform til verdiene gitt i input-feltene.

                    Game selectedGame = list1.getSelectedValue();
                    selectedGame.setGameName(gameName);
                    selectedGame.setKatagori(katagori);
                    selectedGame.setRating(rating);
                    selectedGame.setPlatformnavn(platform);
                    selectedGame.setDevlper(develper);

                    // dette her Tvinger JList-en til å visuelt oppdatere seg
                    list1.updateUI();
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You munt put a int value for antall spille and dobel value for reting ");
                } catch (NullPointerException nullPointerException) {
                    System.out.println("You most seleced somthing");
                }


            }
        });


        slettKnap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selectedIndex = list2.getSelectedIndex();
                gameListModel.remove(selectedIndex);
                list2.updateUI();
            }
        });


        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {

                    Game selectedPerson = list1.getSelectedValue();

                    // Oppdaterer input-feltenes innhold til det selekterte game-objektets navn og alder.
                    gameNameField.setText(selectedPerson.getGameName());
                    katagoriField.setText(selectedPerson.getKatagori());
                    ratingField.setText(Double.toString(selectedPerson.getRating()));
                    platformField.setText(selectedPerson.getPlatformnavn());
                    devlperField.setText(selectedPerson.getDevlper());

                } catch (NullPointerException nullPointerException) {
                    System.out.println("no object selected");
                }

            }
        });


        //PAGE3

        list3.setModel(franchisesDefaultListModel);


        addFranchies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = franchisFiled.getText();
                    String gameName = nyesteSpillFiled.getText();
                    double rating = Double.parseDouble(ratingFiledFran.getText());
                    String katagori = katagoriFiledFran.getText();
                    int antallSpille = Integer.parseInt(antallSpilleField.getText());
                    String platform = platformFieldFran.getText();
                    String develper = develperFieldInFran.getText();
                    Franchises franchises = new Franchises(gameName, katagori, rating, name, antallSpille,
                            platform, develper);
                    franchisesDefaultListModel.addElement(franchises);

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must put a int value for age");
                }
            }
        });


        endreButtonFran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String name = franchisFiled.getText();
                    String gameName = nyesteSpillFiled.getText();
                    double rating = Double.parseDouble(ratingFiledFran.getText());
                    String katagori = katagoriFiledFran.getText();
                    int antallSpille = Integer.parseInt(antallSpilleField.getText());
                    String platform = platformFieldFran.getText();
                    String develper = develperFieldInFran.getText();

                    Franchises selectedFran = list3.getSelectedValue();
                    selectedFran.setName(name);
                    selectedFran.setGameName(gameName);
                    selectedFran.setRating(rating);
                    selectedFran.setKatagori(katagori);
                    selectedFran.setAntallSpille(antallSpille);
                    selectedFran.setPlatformnavn(platform);
                    selectedFran.setDevlper(develper);

                    list3.updateUI();
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You munt put a int value for antallspill");
                } catch (NullPointerException nullPointerException) {
                    System.out.println("You most seleced somthing");
                }


            }
        });


        list3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Franchises selectedFranchises = list3.getSelectedValue();
                    franchisFiled.setText(selectedFranchises.getName());
                    nyesteSpillFiled.setText(selectedFranchises.getGameName());
                    ratingFiledFran.setText(Double.toString(selectedFranchises.getRating()));
                    katagoriFiledFran.setText(selectedFranchises.getKatagori());
                    antallSpilleField.setText(Integer.toString(selectedFranchises.getAntallSpille()));
                    platformFieldFran.setText(selectedFranchises.getPlatformnavn());
                    develperFieldInFran.setText(selectedFranchises.getDevlper());

                } catch (NullPointerException nullPointerException) {
                    System.out.println("no object selected");
                }

            }
        });


        slettButtonFran1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int selectedIndex = list4.getSelectedIndex();
                franchisesDefaultListModel.remove(selectedIndex);
                list4.updateUI();
            }
        });


        hjemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page1);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });


        franchisList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page4);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });
        list4.setModel(franchisesDefaultListModel);


        tilbakeTilFranList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page3);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });



        list5.setModel(delvperDefaultListModel);


        adddeveleper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String develper = develperFieldPage5.getText();
                    int founded= Integer.parseInt(foundedField1.getText());
                    String genre = KatagoriSpecialtyFirld.getText();
                    String notableFranchises = NotabelFranchisesField.getText();

                    GameDelvper gameDelvper = new GameDelvper(develper, founded, genre, notableFranchises);
                    delvperDefaultListModel.addElement(gameDelvper);

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must put a int value for founded");
                }
            }
        });

        slettDevllperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int selectedIndex = list5.getSelectedIndex();
                delvperDefaultListModel.remove(selectedIndex);
                list5.updateUI();
            }
        });


        editDevelperButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String develper = develperFieldPage5.getText();
                    int founded= Integer.parseInt(foundedField1.getText());
                    String genre = KatagoriSpecialtyFirld.getText();
                    String notableFranchises = NotabelFranchisesField.getText();

                    GameDelvper selectedDevelper = list5.getSelectedValue();
                    selectedDevelper.setDevlper(develper);
                    selectedDevelper.setFounded(founded);
                    selectedDevelper.setGenre(genre);
                    selectedDevelper.setNotableFranchises(notableFranchises);




                    list5.updateUI();
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You munt put a int value for antallspill");
                } catch (NullPointerException nullPointerException) {
                    System.out.println("You most seleced somthing");
                }


            }
        });

        list5.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    GameDelvper selectedGameDevelper = list5.getSelectedValue();
                    develperFieldPage5.setText(selectedGameDevelper.getDevlper());
                    foundedField1.setText(Integer.toString(selectedGameDevelper.getFounded()));
                    KatagoriSpecialtyFirld.setText(selectedGameDevelper.getGenre());
                    NotabelFranchisesField.setText(selectedGameDevelper.getNotableFranchises());




                } catch (NullPointerException nullPointerException) {
                    System.out.println("no object selected");
                }

            }
        });

        tilbaketilPage1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLayout.removeAll();
                gameLayout.add(page1);
                gameLayout.repaint();
                gameLayout.revalidate();
            }
        });






    }
}








