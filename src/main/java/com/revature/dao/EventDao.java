package com.revature.dao;

import static com.revature.log.LogUtil.log;
import static com.revature.util.CloseStreams.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import com.revature.beans.Event;
import com.revature.util.ConnectionUtil;

public class EventDao {

	public void insertEvent(Event ev) {
		PreparedStatement ps = null;
		long millis = System.currentTimeMillis();
		Timestamp date = new Timestamp(millis);
		ev.setSubmitted(date);
		ev.setStatus("submitted");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			log.info("JDBC class not found exception");
		}

		try (Connection conn = ConnectionUtil.getConnection();) {
			System.out.println("connection made");
			String sql = "INSERT INTO event_form (emp_id, status, event_type, event_place, description, event_cost, "
					+ "date_submit, date_occur, time_start, justification,"
					+ "format,cutoff) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, ev.getEmpid());
			ps.setString(2, ev.getStatus());
			ps.setString(3, ev.getType());
			ps.setString(4, ev.getLocation());
			ps.setString(5, ev.getDescription());
			ps.setDouble(6, ev.getCost());
			ps.setTimestamp(7, ev.getSubmitted());
			ps.setTimestamp(8, ev.getOccur());
			ps.setTimestamp(9, ev.getTimeStart());
			ps.setString(10, ev.getJustification());
			ps.setString(11, ev.getGradeFormat());
			ps.setString(12, ev.getGradeCutOff());
			int affected = ps.executeUpdate();

			log.info(affected + " form successfully stored.");
		} catch (Exception e2) {
			log.info("New form submission failed.");
			e2.printStackTrace();
		} finally {
			close(ps);
		}
	}

	public void updateEvent(Event ev) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			log.info("JDBC class not found exception");
		}
	}

	public void deleteEvent(Event ev) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			log.info("JDBC class not found exception");
		}
	}

	public void pinAttachment(Event ev, String filePath) {

	}
}
