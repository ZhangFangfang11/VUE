package tufts.vue.gui.renderer;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import tufts.vue.SearchData;

	public class SearchResultTableModel extends AbstractTableModel
    {      
        
        private java.util.List<SearchData> searchResultArrLst = new java.util.ArrayList<SearchData>();
        private int columns = 2;       
        private boolean editFlg;
        public int getRowCount()
        {
            return searchResultArrLst.size();
        }
        public void addRow(SearchData data){
        	searchResultArrLst.add(data);
        	fireTableStructureChanged();
        }
        public void removeRow(int rowIndex){
        	if(searchResultArrLst!=null){
        		searchResultArrLst.remove(rowIndex);
        	}
        	fireTableStructureChanged();
        }
        public void setData(ArrayList dataLst){
        	searchResultArrLst = dataLst;
        }
        public int getColumnCount()
        {
            return columns;
        }
        
        public void setColumns(int columns)
        {
            this.columns = columns;
            fireTableStructureChanged();
        }
        
        public boolean isCellEditable(int row,int col)
        { 
        	if(editFlg && col == 0 ){
        		return true;
        	}
            return false;
        }
        public void setValueAt(Object aValue, int rowIndex, int columnIndex)
        {
        	
        }
        public Object getValueAt(int row,int col)
        {       	
           return "";
        }
        
        public void refresh()
        {
            fireTableDataChanged();
        }
		public void setEditableFlag(boolean b) {
			// TODO Auto-generated method stub
			editFlg = b;
		}        
    }
