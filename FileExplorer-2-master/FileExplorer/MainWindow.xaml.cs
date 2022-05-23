using FileExplorer.ViewModels;
using System.IO;
using System.Windows;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Drawing;
using System.Diagnostics;
using System.Windows.Media.TextFormatting;

namespace FileExplorer
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            DataContext = new DirectoryStructureViewModel();
        }

        private void copy_file(object sender, RoutedEventArgs e)
        {
            try
            {
                
            }
            catch (Exception e1) { MessageBox.Show(e1.Message); }
        }
    }
}
