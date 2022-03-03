package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.StudentInRegisterData;
import org.simplity.fm.test.gen.schema.StudentInRegisterDataTable;
/** class for form marksForStudent  */
public class MarksForStudentForm extends Form {
	protected static final String NAME = "marksForStudent";
	protected static final String SCHEMA = "studentInRegister";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("marks", "cieMarks", 0, 0, null,null ,null, true)};
/** constructor */
public MarksForStudentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public MarksForStudentFd newFormData() {
		return new MarksForStudentFd(this, null, null, null);
	}

	@Override
	public MarksForStudentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksForStudentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksForStudentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksForStudentFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksForStudentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksForStudentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksForStudentFdt newFormDataTable() {
		return new MarksForStudentFdt(this, null, null, null);
	}

	@Override
	public MarksForStudentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksForStudentFd(this, (StudentInRegisterData) schemaData, values, data);
	}

	@Override
	public MarksForStudentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksForStudentFdt(this, (StudentInRegisterDataTable) table, values, linkedData);
	}
}
