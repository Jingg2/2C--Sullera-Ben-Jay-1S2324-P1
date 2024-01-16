
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
	private String font = "Times New Roman";
	final JLabel Total = new JLabel();
	private JPanel contentPane;
	final JButton btnDelete = new JButton("delete");
	private JTextField txtName;
	private JTextField txtColor;
	private JTextField txtPrice;
	private JTable table;
	final SchoolSupply school = new SchoolSupply();
	final SportSupply sport = new SportSupply();
	final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	public static void main(String[] args) {
		Main main = new Main();
		main.frame();

	}

	public void frame() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 674, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane.setBounds(144, -27, 504, 386);
		contentPane.add(tabbedPane);

		JPanel panelView = new JPanel();
		panelView.setBackground(new Color(0, 0, 0));
		tabbedPane.addTab("View", null, panelView, null);
		panelView.setLayout(null);

		JButton btnSport = new JButton("Sport Supply");
		btnSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sport view or view sport supply
				final DefaultTableModel sportModel = (DefaultTableModel) table.getModel();
				sportModel.setRowCount(0);

				for (int i = 0; i < sport.size(); i++) {

					sportModel.addRow(new Object[] { sport.getName(i), sport.getColor(i),
							sport.getPrice(i)

					});
				}

				// TO Delete Row and product
				Total.setText("Total: " + sport.total());
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// listener for delete button
						int[] selectedRows = table.getSelectedRows();

						for (int i = selectedRows.length - 1; i >= 0; i--) {
							int rowToDelete = selectedRows[i];
							sportModel.removeRow(rowToDelete);
							sport.remove(rowToDelete);

						}

					}
				});
			}
		});
		btnSport.setFont(new Font(font, Font.BOLD, 20));
		btnSport.setBounds(44, 306, 145, 41);
		panelView.add(btnSport);

		// same Process
		JButton btnSchoolSupply = new JButton("School Supply");
		btnSchoolSupply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// school view
				final DefaultTableModel schoolModel = (DefaultTableModel) table.getModel();
				schoolModel.setRowCount(0);
				for (int i = 0; i < school.size(); i++) {

					schoolModel.addRow(new Object[] { school.getName(i), school.getColor(i),
							school.getPrice(i)

					});
				}
				Total.setText("Total: " + school.total());
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// listener for delete button
						int[] selectedRows = table.getSelectedRows();

						for (int i = selectedRows.length - 1; i >= 0; i--) {
							int rowToDelete = selectedRows[i];
							schoolModel.removeRow(rowToDelete);
							school.remove(rowToDelete);

						}

					}
				});
			}

		});

		btnSchoolSupply.setFont(new Font(font, Font.BOLD, 20));
		btnSchoolSupply.setBounds(264, 306, 162, 41);
		panelView.add(btnSchoolSupply);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 499, 278);
		panelView.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Name", "Color", "Price"
				}));
		table.getColumnModel().getColumn(0).setPreferredWidth(146);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(108);
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(0, 0, 0));

		Total.setFont(new Font(font, Font.BOLD | Font.ITALIC, 17));
		Total.setForeground(new Color(255, 255, 255));
		Total.setBounds(10, 278, 162, 30);
		panelView.add(Total);
		// ben jay
		JPanel panelAdd = new JPanel();
		panelAdd.setBackground(new Color(0, 0, 0));
		panelAdd.setForeground(new Color(0, 0, 0));
		tabbedPane.addTab("Add", null, panelAdd, null);
		panelAdd.setLayout(null);

		JLabel lblAdd = new JLabel("Add Product");
		lblAdd.setForeground(new Color(255, 255, 255));
		lblAdd.setFont(new Font(font, Font.BOLD, 22));
		lblAdd.setBounds(187, 11, 140, 36);
		panelAdd.add(lblAdd);

		JLabel name = new JLabel("Name");
		name.setForeground(new Color(255, 255, 255));
		name.setBackground(new Color(255, 255, 255));
		name.setFont(new Font(font, Font.BOLD | Font.ITALIC, 18));
		name.setBounds(26, 67, 98, 23);
		panelAdd.add(name);

		txtName = new JTextField();
		txtName.setBounds(26, 87, 164, 23);
		panelAdd.add(txtName);
		txtName.setColumns(10);

		JLabel lblColor = new JLabel("Color");
		lblColor.setForeground(new Color(255, 255, 255));
		lblColor.setFont(new Font(font, Font.BOLD | Font.ITALIC, 18));
		lblColor.setBounds(26, 131, 98, 23);
		panelAdd.add(lblColor);

		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(26, 152, 164, 23);
		panelAdd.add(txtColor);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(255, 255, 255));
		lblPrice.setFont(new Font(font, Font.BOLD | Font.ITALIC, 18));
		lblPrice.setBounds(26, 193, 98, 23);
		panelAdd.add(lblPrice);

		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(26, 215, 164, 23);
		panelAdd.add(txtPrice);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// add priduct
				try {
					String[] options = { "Sports Supply", "School Supply" };

					int result = JOptionPane.showOptionDialog(
							null,
							"Choose an option:",
							"Option Dialog",
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.INFORMATION_MESSAGE,
							null,
							options,
							options[0]);
					if (result == 0) {

						if (hasInt() == true) {
							sport.setName(txtName.getText());
							sport.setColor(txtColor.getText());
							int price = Integer.parseInt(txtPrice.getText());
							sport.setPrice(price);
							txtName.setText("");
							txtColor.setText("");
							txtPrice.setText("");
						} else
							JOptionPane.showMessageDialog(
									null,
									"Invalid Input",
									"Warning",
									JOptionPane.WARNING_MESSAGE);

					} else if (result == 1) {

						if (hasInt() == true) {
							school.setName(txtName.getText());
							school.setColor(txtColor.getText());
							int price = Integer.parseInt(txtPrice.getText());
							school.setPrice(price);
							txtName.setText("");
							txtColor.setText("");
							txtPrice.setText("");
						} else
							JOptionPane.showMessageDialog(
									null,
									"Invalid Input",
									"Warning",
									JOptionPane.WARNING_MESSAGE);

					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(
							null,
							"Invalid Input",
							"Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			private boolean hasInt() {

				try {

					Integer.parseInt(txtPrice.getText());
					return true;
				} catch (NumberFormatException e) {
					return false;
				}
			}
		});
		btnSubmit.setFont(new Font(font, Font.BOLD, 20));
		btnSubmit.setBounds(36, 249, 124, 36);
		panelAdd.add(btnSubmit);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Acer\\Downloads\\add-item.png"));
		lblNewLabel.setBounds(266, 87, 176, 151);
		panelAdd.add(lblNewLabel);

		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font(font, Font.BOLD, 19));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// add buton
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAdd.setBounds(10, 84, 124, 36);
		contentPane.add(btnAdd);

		JButton btnViewProduct = new JButton("View Product");
		btnViewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// view Buton
				tabbedPane.setSelectedIndex(0);
				final DefaultTableModel Model = (DefaultTableModel) table.getModel();
				Model.setRowCount(0);
				for (int i = 0; i < school.size(); i++) {

					Model.addRow(new Object[] { school.getName(i), school.getColor(i),
							school.getPrice(i)

					});
				}
				for (int i = 0; i < sport.size(); i++) {

					Model.addRow(new Object[] { sport.getName(i), sport.getColor(i),
							sport.getPrice(i)

					});
				}
				Total.setText("Total: " + (sport.total() + school.total()));

			}

		});
		btnViewProduct.setFont(new Font(font, Font.BOLD, 19));
		btnViewProduct.setBounds(0, 190, 147, 36);
		contentPane.add(btnViewProduct);

		btnDelete.setFont(new Font(font, Font.BOLD, 20));
		btnDelete.setBounds(10, 254, 124, 36);
		contentPane.add(btnDelete);

		frame.setVisible(true);
	}

}
