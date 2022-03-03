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
import org.simplity.fm.test.gen.schema.ExamAttendeeNameData;
import org.simplity.fm.test.gen.schema.ExamAttendeeNameDataTable;
/** class for form examAttendeeName  */
public class ExamAttendeeNameForm extends Form {
	protected static final String NAME = "examAttendeeName";
	protected static final String SCHEMA = "examAttendeeName";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public ExamAttendeeNameForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ExamAttendeeNameFd newFormData() {
		return new ExamAttendeeNameFd(this, null, null, null);
	}

	@Override
	public ExamAttendeeNameFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ExamAttendeeNameFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ExamAttendeeNameFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ExamAttendeeNameFd)super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendeeNameFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ExamAttendeeNameFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ExamAttendeeNameFdt newFormDataTable() {
		return new ExamAttendeeNameFdt(this, null, null, null);
	}

	@Override
	public ExamAttendeeNameFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ExamAttendeeNameFd(this, (ExamAttendeeNameData) schemaData, values, data);
	}

	@Override
	public ExamAttendeeNameFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ExamAttendeeNameFdt(this, (ExamAttendeeNameDataTable) table, values, linkedData);
	}
}
