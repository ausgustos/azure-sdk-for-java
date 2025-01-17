// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.SnapshotPolicyPatch;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPolicyPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPolicyPatch model =
            BinaryData
                .fromString(
                    "{\"location\":\"ikvmkqzeqqk\",\"id\":\"tfz\",\"name\":\"hhvh\",\"type\":\"r\",\"tags\":{\"xbxwa\":\"kwobdagxtibq\",\"iplbpodxunkbebxm\":\"bogqxndlkzgxhu\",\"oievseotgqrlltm\":\"byyntwlrbqt\"},\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":738915892,\"minute\":284153241,\"usedBytes\":2432465930399611430},\"dailySchedule\":{\"snapshotsToKeep\":1065910925,\"hour\":2123049773,\"minute\":904231635,\"usedBytes\":367607290034890001},\"weeklySchedule\":{\"snapshotsToKeep\":1571088052,\"day\":\"bttdumorppxe\",\"hour\":1702938248,\"minute\":1487228003,\"usedBytes\":6728883083486841207},\"monthlySchedule\":{\"snapshotsToKeep\":1089631014,\"daysOfMonth\":\"kfgohdneue\",\"hour\":1976701075,\"minute\":1777092191,\"usedBytes\":5814437001624716680},\"enabled\":true,\"provisioningState\":\"fikdowwqu\"}}")
                .toObject(SnapshotPolicyPatch.class);
        Assertions.assertEquals("ikvmkqzeqqk", model.location());
        Assertions.assertEquals("kwobdagxtibq", model.tags().get("xbxwa"));
        Assertions.assertEquals(738915892, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(284153241, model.hourlySchedule().minute());
        Assertions.assertEquals(2432465930399611430L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(1065910925, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2123049773, model.dailySchedule().hour());
        Assertions.assertEquals(904231635, model.dailySchedule().minute());
        Assertions.assertEquals(367607290034890001L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1571088052, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("bttdumorppxe", model.weeklySchedule().day());
        Assertions.assertEquals(1702938248, model.weeklySchedule().hour());
        Assertions.assertEquals(1487228003, model.weeklySchedule().minute());
        Assertions.assertEquals(6728883083486841207L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(1089631014, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("kfgohdneue", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1976701075, model.monthlySchedule().hour());
        Assertions.assertEquals(1777092191, model.monthlySchedule().minute());
        Assertions.assertEquals(5814437001624716680L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPolicyPatch model =
            new SnapshotPolicyPatch()
                .withLocation("ikvmkqzeqqk")
                .withTags(
                    mapOf(
                        "xbxwa",
                        "kwobdagxtibq",
                        "iplbpodxunkbebxm",
                        "bogqxndlkzgxhu",
                        "oievseotgqrlltm",
                        "byyntwlrbqt"))
                .withHourlySchedule(
                    new HourlySchedule()
                        .withSnapshotsToKeep(738915892)
                        .withMinute(284153241)
                        .withUsedBytes(2432465930399611430L))
                .withDailySchedule(
                    new DailySchedule()
                        .withSnapshotsToKeep(1065910925)
                        .withHour(2123049773)
                        .withMinute(904231635)
                        .withUsedBytes(367607290034890001L))
                .withWeeklySchedule(
                    new WeeklySchedule()
                        .withSnapshotsToKeep(1571088052)
                        .withDay("bttdumorppxe")
                        .withHour(1702938248)
                        .withMinute(1487228003)
                        .withUsedBytes(6728883083486841207L))
                .withMonthlySchedule(
                    new MonthlySchedule()
                        .withSnapshotsToKeep(1089631014)
                        .withDaysOfMonth("kfgohdneue")
                        .withHour(1976701075)
                        .withMinute(1777092191)
                        .withUsedBytes(5814437001624716680L))
                .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(SnapshotPolicyPatch.class);
        Assertions.assertEquals("ikvmkqzeqqk", model.location());
        Assertions.assertEquals("kwobdagxtibq", model.tags().get("xbxwa"));
        Assertions.assertEquals(738915892, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(284153241, model.hourlySchedule().minute());
        Assertions.assertEquals(2432465930399611430L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(1065910925, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2123049773, model.dailySchedule().hour());
        Assertions.assertEquals(904231635, model.dailySchedule().minute());
        Assertions.assertEquals(367607290034890001L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1571088052, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("bttdumorppxe", model.weeklySchedule().day());
        Assertions.assertEquals(1702938248, model.weeklySchedule().hour());
        Assertions.assertEquals(1487228003, model.weeklySchedule().minute());
        Assertions.assertEquals(6728883083486841207L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(1089631014, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("kfgohdneue", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1976701075, model.monthlySchedule().hour());
        Assertions.assertEquals(1777092191, model.monthlySchedule().minute());
        Assertions.assertEquals(5814437001624716680L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
