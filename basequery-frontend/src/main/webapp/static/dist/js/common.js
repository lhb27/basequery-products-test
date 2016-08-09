var daterangepickerOpt={
	"singleDatePicker": true,
	"format": "MM/DD/YYYY",
	"locale": {
		"daysOfWeek": [
			"一",
			"二",
			"三",
			"四",
			"五",
			"六",
			"日"
		],
		"monthNames": [
			"一月",
			"二月",
			"三月",
			"四月",
			"五月",
			"六月",
			"七月",
			"八月",
			"九月",
			"十月",
			"十一月",
			"十二月"
		],
		"firstDay": 0
	}
}

var dataTableOpt={
	"dom":"<'row'<'col-sm-12'tr>>" +
		  "<'page-container clearfix'<'pageing-info'i><'pageing-list'p>>",
	"paging": true,
	"lengthChange": false,
	"searching": true,
	"ordering": false,
	"info": true,
	"autoWidth": false,
	"pagingType": "simple_numbers",
	"language": {
		"infoFiltered":"",
		"zeroRecords": "找不到符合条件的数据",
		"infoEmpty": "",
		"info": "共 _PAGES_ 页，到第 <input type='text' class='form-control jump-page-input' value='_PAGE_'> 页 <button class='btn btn-block btn-default sure-btn'>确定</button>",
		"paginate": {
		  "previous": "上一页",
		  "next": "下一页"
		}
	}
}