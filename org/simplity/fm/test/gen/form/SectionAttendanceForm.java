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
import org.simplity.fm.test.gen.schema.SectionAttendanceData;
import org.simplity.fm.test.gen.schema.SectionAttendanceDataTable;
/** class for form sectionAttendance  */
public class SectionAttendanceForm extends Form {
	protected static final String NAME = "sectionAttendance";
	protected static final String SCHEMA = "sectionAttendance";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public SectionAttendanceForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SectionAttendanceFd newFormData() {
		return new SectionAttendanceFd(this, null, null, null);
	}

	@Override
	public SectionAttendanceFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SectionAttendanceFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SectionAttendanceFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SectionAttendanceFd)super.parseKeys(json, ctx);
	}

	@Override
	public SectionAttendanceFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SectionAttendanceFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SectionAttendanceFdt newFormDataTable() {
		return new SectionAttendanceFdt(this, null, null, null);
	}

	@Override
	public SectionAttendanceFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SectionAttendanceFd(this, (SectionAttendanceData) schemaData, values, data);
	}

	@Override
	public SectionAttendanceFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SectionAttendanceFdt(this, (SectionAttendanceDataTable) table, values, linkedData);
	}
}
