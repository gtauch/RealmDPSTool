package main;

import javax.swing.*;

import enums.Ability;
import enums.Armor;
import enums.Ring;
import enums.Stat;
import enums.Weapon;
import enums.Ability.AbilityType;
import enums.Armor.ArmorType;
import enums.Weapon.WeaponType;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JComboBox<String> classBox;
    private final JComboBox<String> weaponBox;
    private final JComboBox<String> abilityBox;
    private final JComboBox<String> armorBox;
    private final JComboBox<String> ringBox;
    private final JTextArea displayArea;

    public Window() {
        setTitle("Loadout Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 840);
        setLayout(new BorderLayout(10, 10));

        // Sample data (replace with real item names)
        String[] classes =  Arrays.stream(Classes.values()).map(Enum::name).toArray(String[]::new);
        String[] weapons = Arrays.stream(Weapon.values()).map(Enum::name).toArray(String[]::new);
        String[] ability = Arrays.stream(Ability.values()).map(Enum::name).toArray(String[]::new);
        String[] armors = Arrays.stream(Armor.values()).map(Enum::name).toArray(String[]::new);
        String[] rings = Arrays.stream(Ring.values()).map(Enum::name).toArray(String[]::new);

        // Dropdown panels
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        classBox = new JComboBox<>(classes);
        weaponBox = new JComboBox<>(weapons);
        abilityBox = new JComboBox<>(ability);
        armorBox = new JComboBox<>(armors);
        ringBox = new JComboBox<>(rings);

        inputPanel.add(new JLabel("Class:"));
        inputPanel.add(classBox);
        inputPanel.add(new JLabel("Weapon:"));
        inputPanel.add(weaponBox);
        inputPanel.add(new JLabel("Ability:"));
        inputPanel.add(abilityBox);
        inputPanel.add(new JLabel("Armor:"));
        inputPanel.add(armorBox);
        inputPanel.add(new JLabel("Ring:"));
        inputPanel.add(ringBox);

        // Display panel
        displayArea = new JTextArea(5, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Add components
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Update display when selection changes
        ActionListener updateListener = e -> updateDisplay();
        ActionListener updateClass = e -> updateClass();
        classBox.addActionListener(updateClass);
        weaponBox.addActionListener(updateListener);
        abilityBox.addActionListener(updateListener);
        armorBox.addActionListener(updateListener);
        ringBox.addActionListener(updateListener);

        updateDisplay(); // initial update
        setVisible(true);
    }

    private void updateDisplay() {
        String selectedClass = (String) classBox.getSelectedItem();
        String selectedWeapon = (String) weaponBox.getSelectedItem();
        String selectedAbility = (String) abilityBox.getSelectedItem();
        String selectedArmor = (String) armorBox.getSelectedItem();
        String selectedRing = (String) ringBox.getSelectedItem();
                
        Player player = Main.player;
        
        player.classChoice = Classes.valueOf((String)classBox.getSelectedItem());
        player.weapon = Weapon.valueOf((String)weaponBox.getSelectedItem());
        player.ability = Ability.valueOf((String)abilityBox.getSelectedItem());
        player.armor = Armor.valueOf((String)armorBox.getSelectedItem());
        player.ring = Ring.valueOf((String)ringBox.getSelectedItem());
        
        player.recalculateStats();
        
        String life1 = String.valueOf(player.getStat(Stat.Life));
        String life2 = String.valueOf(player.classChoice.stats.get(Stat.Life));
        String life3 = String.valueOf(player.getStat(Stat.Life) - player.classChoice.stats.get(Stat.Life));
        
        String mana1 = String.valueOf(player.getStat(Stat.Mana));
        String mana2 = String.valueOf(player.classChoice.stats.get(Stat.Mana));
        String mana3 = String.valueOf(player.getStat(Stat.Mana) - player.classChoice.stats.get(Stat.Mana));

        String attack1 = String.valueOf(player.getStat(Stat.Attack));
        String attack2 = String.valueOf(player.classChoice.stats.get(Stat.Attack));
        String attack3 = String.valueOf(player.getStat(Stat.Attack) - player.classChoice.stats.get(Stat.Attack));

        String defense1 = String.valueOf(player.getStat(Stat.Defense));
        String defense2 = String.valueOf(player.classChoice.stats.get(Stat.Defense));
        String defense3 = String.valueOf(player.getStat(Stat.Defense) - player.classChoice.stats.get(Stat.Defense));

        String speed1 = String.valueOf(player.getStat(Stat.Speed));
        String speed2 = String.valueOf(player.classChoice.stats.get(Stat.Speed));
        String speed3 = String.valueOf(player.getStat(Stat.Speed) - player.classChoice.stats.get(Stat.Speed));

        String dexterity1 = String.valueOf(player.getStat(Stat.Dexterity));
        String dexterity2 = String.valueOf(player.classChoice.stats.get(Stat.Dexterity));
        String dexterity3 = String.valueOf(player.getStat(Stat.Dexterity) - player.classChoice.stats.get(Stat.Dexterity));

        String vitality1 = String.valueOf(player.getStat(Stat.Vitality));
        String vitality2 = String.valueOf(player.classChoice.stats.get(Stat.Vitality));
        String vitality3 = String.valueOf(player.getStat(Stat.Vitality) - player.classChoice.stats.get(Stat.Vitality));

        String wisdom1 = String.valueOf(player.getStat(Stat.Wisdom));
        String wisdom2 = String.valueOf(player.classChoice.stats.get(Stat.Wisdom));
        String wisdom3 = String.valueOf(player.getStat(Stat.Wisdom) - player.classChoice.stats.get(Stat.Wisdom));
        
        String dps1 = String.valueOf(Main.getDPSatDefense(0));
        String dps2 = String.valueOf(Main.getDPSatDefense(25));
        String dps3 = String.valueOf(Main.getDPSatDefense(100));
        String dps4 = String.valueOf(Main.getDPSatDefense(500));

        displayArea.setText("""
            Class: %s
            Weapon: %s
            Ability: %s
            Armor: %s
            Ring: %s

        	Life: %s (%s + %s) 
        	Mana: %s (%s + %s) 
        	Attack: %s (%s + %s) 
        	Defense: %s (%s + %s) 
        	Speed: %s (%s + %s) 
        	Dexterity: %s (%s + %s) 
        	Vitalit: %s (%s + %s) 
        	Wisdom: %s (%s + %s) 

        	DPS at different Defense:
        	0: %s
        	25: %s
        	100: %s
        	500: %s
            """.formatted(selectedClass, selectedWeapon, selectedAbility, selectedArmor, selectedRing,
            		life1, life2, life3,
            		mana1, mana2, mana3,
            		attack1, attack2, attack3,
            		defense1, defense2, defense3,
            		speed1, speed2, speed3,
            		dexterity1, dexterity2, dexterity3,
            		vitality1, vitality2, vitality3,
            		wisdom1, wisdom2, wisdom3,
            		dps1, dps2, dps3, dps4));
    }
    
    private void updateClass() {
        ActionListener weaponListener = weaponBox.getActionListeners()[0];
        ActionListener abilityListener = abilityBox.getActionListeners()[0];
        ActionListener armorListener = armorBox.getActionListeners()[0];
        
        weaponBox.removeActionListener(weaponListener);
        abilityBox.removeActionListener(abilityListener);
        armorBox.removeActionListener(armorListener);
        
    	weaponBox.removeAllItems();
    	abilityBox.removeAllItems();
    	armorBox.removeAllItems();

        for (Weapon weapon : Weapon.values()) {
        	if (weapon.getType() == Classes.valueOf(classBox.getSelectedItem().toString()).weaponType || weapon.getType() == WeaponType.None) {
                weaponBox.addItem(weapon.toString());
        	}
        }
    	
        for (Ability ability : Ability.values()) {
        	if (ability.getType() == Classes.valueOf(classBox.getSelectedItem().toString()).abilityType || ability.getType() == AbilityType.None) {
        		abilityBox.addItem(ability.toString());
        	}
        }
        
        for (Armor armor : Armor.values()) {
        	if (armor.getType() == Classes.valueOf(classBox.getSelectedItem().toString()).armorType || armor.getType() == ArmorType.None) {
                armorBox.addItem(armor.toString());
        	}
        }
        
        weaponBox.setSelectedIndex(0);
        abilityBox.setSelectedIndex(0);
        armorBox.setSelectedIndex(0);
        
        weaponBox.addActionListener(weaponListener);
        abilityBox.addActionListener(abilityListener);
        armorBox.addActionListener(armorListener);
        
    	updateDisplay();
    }
    
}
