package(default_visibility = ["//visibility:public"])

java_library(
    name = "java_test_deps",
    exports = [
        "@maven//:junit_junit",
        "@maven//:mysql_mysql_connector_java",
        "@maven//:com_google_inject_guice",
        "@maven//:com_google_inject_extensions_guice_persist",
        "@maven//:org_hibernate_hibernate_entitymanager",
        "@maven//:org_slf4j_slf4j_simple",
        "@maven//:org_hibernate_javax_persistence_hibernate_jpa_2_1_api"
    ],
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]) + [
        "//src/main/java/com/haowei/userpayment/server:srcs",
        "//src/main/proto:srcs",
        "//src/main/resources:srcs",
    ],
)
