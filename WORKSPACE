load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# rules jvm externel
# if you want to use this, put this above #rules_proto_grpc

RULES_JVM_EXTERNAL_TAG = "4.0"
RULES_JVM_EXTERNAL_SHA = "31701ad93dbfe544d597dbe62c9a1fdd76d81d8a9150c2bf1ecf928ecdf97169"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "com.google.inject:guice:3.0",
        "com.google.inject.extensions:guice-persist:3.0",
        "org.hibernate:hibernate-entitymanager:4.3.6.Final",
        "mysql:mysql-connector-java:8.0.22",
        "junit:junit:4.13.1",
        "org.slf4j:slf4j-simple:1.5.5",
        "org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final",
    ],
    repositories = [
        # Private repositories are supported through HTTP Basic auth
        "http://username:password@localhost:8081/artifactory/my-repository",
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)
