cpp_get_$field_name$_at(p_cpp_obj:POINTER; p_value:INTEGER):INTEGER
external
	"C++ inline use %"$header_file_name$%""
alias
	"[
		$pb_parent_type$* objPtr = ($pb_parent_type$ *)\$p_cpp_obj;			
		return objPtr->$field_name$(\$p_value);
	]"
end