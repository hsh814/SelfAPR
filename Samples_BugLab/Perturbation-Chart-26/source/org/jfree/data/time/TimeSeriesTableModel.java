[buglab_swap_variables]^return row.getValue ( this.series ) ;^179^^^^^174^184^return this.series.getValue ( row ) ;^[CLASS] TimeSeriesTableModel  [METHOD] getValueAt [RETURN_TYPE] Object   int row int column [VARIABLES] TimeSeries  series  boolean  editable  RegularTimePeriod  newTimePeriod  Number  newValue  int  column  row  
[buglab_swap_variables]^return row.getTimePeriod ( this.series ) ;^175^^^^^171^200^return this.series.getTimePeriod ( row ) ;^[CLASS] TimeSeriesTableModel  [METHOD] getValueAt [RETURN_TYPE] Object   int row int column [VARIABLES] TimeSeries  series  boolean  editable  RegularTimePeriod  newTimePeriod  Number  newValue  int  column  row  
[buglab_swap_variables]^return row.getValue ( this.series ) ;^179^^^^^171^200^return this.series.getValue ( row ) ;^[CLASS] TimeSeriesTableModel  [METHOD] getValueAt [RETURN_TYPE] Object   int row int column [VARIABLES] TimeSeries  series  boolean  editable  RegularTimePeriod  newTimePeriod  Number  newValue  int  column  row  
[buglab_swap_variables]^this.series.update (  v ) ;^239^^^^^231^256^this.series.update ( row, v ) ;^[CLASS] TimeSeriesTableModel  [METHOD] setValueAt [RETURN_TYPE] void   Object value int row int column [VARIABLES] TimeSeries  series  boolean  editable  Number  newValue  NumberFormatException  nfe  Object  value  RegularTimePeriod  newTimePeriod  Double  v  int  column  row  
[buglab_swap_variables]^this.series.update ( row ) ;^239^^^^^231^256^this.series.update ( row, v ) ;^[CLASS] TimeSeriesTableModel  [METHOD] setValueAt [RETURN_TYPE] void   Object value int row int column [VARIABLES] TimeSeries  series  boolean  editable  Number  newValue  NumberFormatException  nfe  Object  value  RegularTimePeriod  newTimePeriod  Double  v  int  column  row  
[buglab_swap_variables]^this.series.update ( v, row ) ;^239^^^^^231^256^this.series.update ( row, v ) ;^[CLASS] TimeSeriesTableModel  [METHOD] setValueAt [RETURN_TYPE] void   Object value int row int column [VARIABLES] TimeSeries  series  boolean  editable  Number  newValue  NumberFormatException  nfe  Object  value  RegularTimePeriod  newTimePeriod  Double  v  int  column  row  